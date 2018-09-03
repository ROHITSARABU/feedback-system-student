package com.my.feedback_backend.dao;

import java.util.List;

import com.my.feedback_backend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();

	Category get(int id);

	
}
