package com.ecommerce.galleon.controller;

import com.ecommerce.galleon.model.Category;
import com.ecommerce.galleon.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Success";
    }

    @GetMapping("/list")
    public List<Category> listCategory() {
        return categoryService.listCategory();
    }

    @PostMapping("/update/{categoryId}")
    public String updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category) {
        categoryService.updateCategory(categoryId, category);
        return "Success";
    }

}
