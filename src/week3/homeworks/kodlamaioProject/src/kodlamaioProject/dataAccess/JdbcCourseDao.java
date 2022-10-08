package kodlamaioProject.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioProject.entities.Course;

public class JdbcCourseDao implements CourseDao {
	private List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Course: " + course.getName() + " added to database with JDBC.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Course: " + course.getName() + " updated with JDBC.");
		
	}

	@Override
	public void delete(Course course) {
		courses.remove(course);
		System.out.println("Course: " + course.getName() + " deleted with JDBC.");
	}
	
	@Override
	public List<Course> getAll() {
		return courses;
	}

}
