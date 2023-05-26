package com.ecommerce.galleon.service;

import com.ecommerce.galleon.model.Category;
import com.ecommerce.galleon.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }

    public void updateCategory(int categoryId, Category updatedCategory) {
        Category category = categoryRepository.getById(categoryId);
        category.setCategoryName(updatedCategory.getCategoryName());
        category.setDescription(updatedCategory.getDescription());
        category.setImageUrl(updatedCategory.getImageUrl());
        categoryRepository.save(category);
    }
}
