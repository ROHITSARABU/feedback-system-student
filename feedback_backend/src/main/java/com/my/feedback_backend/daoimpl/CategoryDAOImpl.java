package com.my.feedback_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.my.feedback_backend.dao.CategoryDAO;
import com.my.feedback_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding the 1st category
		category.setId(1);
		category.setName("Student");
		category.setDescription("this is the description of student");

		categories.add(category);

		// second category

		category = new Category();
		category.setId(2);
		category.setName("Faculty");
		category.setDescription("this is the description of faculty");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Questions");
		category.setDescription("this is the description of question");

		categories.add(category);

	}

	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {

		// enhance for loop

		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}

		return null;
	}

}
