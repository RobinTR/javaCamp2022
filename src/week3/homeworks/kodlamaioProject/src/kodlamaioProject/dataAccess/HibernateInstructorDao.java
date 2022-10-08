package kodlamaioProject.dataAccess;

import kodlamaioProject.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor: " + instructor.getFirstName() + " added to database with Hibernate.");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor: " + instructor.getFirstName() + " deleted with Hibernate.");
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor: " + instructor.getFirstName() + " updated with Hibernate.");
	}

}
