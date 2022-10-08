package kodlamaioProject.business;

import java.util.List;

import kodlamaioProject.core.logging.*;
import kodlamaioProject.core.validate.CourseValidator;
import kodlamaioProject.dataAccess.CourseDao;
import kodlamaioProject.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		CourseValidator.isNameValid(courseDao.getAll(), course);
		CourseValidator.isPriceValid(course);
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
	public void update(Course course) {
		courseDao.update(course);
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
	public List<Course> getCourses() {
		return courseDao.getAll();
	}
}
