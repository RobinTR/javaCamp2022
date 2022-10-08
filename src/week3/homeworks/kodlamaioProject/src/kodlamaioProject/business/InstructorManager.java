package kodlamaioProject.business;

import kodlamaioProject.core.logging.*;
import kodlamaioProject.dataAccess.InstructorDao;
import kodlamaioProject.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
	
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
}
