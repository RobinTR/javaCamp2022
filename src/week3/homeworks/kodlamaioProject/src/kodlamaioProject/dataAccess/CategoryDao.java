package kodlamaioProject.dataAccess;

import java.util.List;

import kodlamaioProject.entities.Category;

public interface CategoryDao {
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	List<Category> getAll();
}
