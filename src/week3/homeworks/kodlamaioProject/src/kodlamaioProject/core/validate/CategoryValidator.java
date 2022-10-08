package kodlamaioProject.core.validate;

import java.util.List;

import kodlamaioProject.entities.Category;

public class CategoryValidator {
	public static void isNameValid(List<Category> categories, Category category) throws Exception {
		for(Category ctgry : categories) {
			if (ctgry.getName().equals(category.getName())) {
				throw new Exception("There is already a Category with this name exists.");
			}
		}
	}
}
