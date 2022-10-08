package kodlamaioProject.dataAccess;

import java.util.List;

import kodlamaioProject.entities.Course;

public interface CourseDao {
	void add(Course course);
	void update(Course course);
	void delete(Course course);
	List<Course> getAll();
}
