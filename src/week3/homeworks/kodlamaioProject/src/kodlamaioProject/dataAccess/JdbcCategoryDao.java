package kodlamaioProject.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioProject.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	private List<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Category: " + category.getName() + " added to database with JDBC.");
	}

	@Override
	public void update(Category category) {
		System.out.println("Category: " + category.getName() + " updated with JDBC.");
	}

	@Override
	public void delete(Category category) {
		categories.remove(category);
		System.out.println("Category: " + category.getName() + " deleted with JDBC.");
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}

}
