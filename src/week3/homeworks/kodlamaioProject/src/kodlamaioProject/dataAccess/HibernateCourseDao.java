package kodlamaioProject.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioProject.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Course: " + course.getName() + " added to database with Hibernate.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Course: " + course.getName() + " updated with Hibernate.");
		
	}

	@Override
	public void delete(Course course) {
		courses.remove(course);
		System.out.println("Course: " + course.getName() + " deleted with Hibernate.");
	}
	
	@Override
	public List<Course> getAll() {
		return courses;
	}

}
