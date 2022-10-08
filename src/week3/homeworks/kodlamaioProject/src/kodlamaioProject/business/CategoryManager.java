package kodlamaioProject.business;

import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.core.validate.CategoryValidator;
import kodlamaioProject.dataAccess.CategoryDao;
import kodlamaioProject.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		CategoryValidator.isNameValid(categoryDao.getAll(),category);
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	public void update(Category category) {
		categoryDao.update(category);
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);
	}
}
