package kodlamaioProject;

import kodlamaioProject.business.*;
import kodlamaioProject.core.logging.*;
import kodlamaioProject.dataAccess.HibernateCategoryDao;
import kodlamaioProject.dataAccess.HibernateInstructorDao;
import kodlamaioProject.dataAccess.JdbcCourseDao;
import kodlamaioProject.entities.Category;
import kodlamaioProject.entities.Course;
import kodlamaioProject.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category(1,"Category1");
		Course course = new Course(1,"Course1","Course description",80);
		Course course2 = new Course(2,"Course2","Course description",0);
		Instructor instructor = new Instructor(1,"Engin","Demiroğ");
		Logger[] loggers = {new MailLogger(), new FileLogger(), new DatabaseLogger()};
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		courseManager.add(new Course(3,"Course3", "Course description", 500));
		courseManager.add(new Course(4,"Course4", "Course description", 200));
		//courseManager.add(course); //Will throw error because you can't add 2 courses with same name.
		//courseManager.add(course2); //Will throw error because price == 0
		courseManager.delete(course);
		
		System.out.println("---------------All Jdbc courses (Simulated with ArrayList)----------------");
		for (Course crs : courseManager.getCourses()) {
			System.out.println(crs.getName());
		}
		System.out.println("---------------All Jdbc courses (Simulated with ArrayList)----------------");
		
		Logger[] loggers2 = {new MailLogger()};
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers2);
		instructorManager.add(instructor);

	}

}
