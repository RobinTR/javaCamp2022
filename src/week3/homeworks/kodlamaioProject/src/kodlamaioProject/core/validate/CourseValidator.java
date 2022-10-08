package kodlamaioProject.core.validate;

import java.util.List;

import kodlamaioProject.entities.Course;

public class CourseValidator {
	public static void isNameValid(List<Course> courses, Course course) throws Exception {
		for (Course crs : courses) {
			if (crs.getName().equals(course.getName())) {
				throw new Exception("There is already a Course with this name exists.");
			}
		}
	}
	
	public static void isPriceValid(Course course) throws Exception {
		if (course.getPrice() <= 0) {
			throw new Exception("Course price must be bigger than 0");
		}
	}
}
