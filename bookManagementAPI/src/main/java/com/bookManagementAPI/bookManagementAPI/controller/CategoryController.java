package com.bookManagementAPI.bookManagementAPI.controller;

import com.bookManagementAPI.bookManagementAPI.entity.Category;
import com.bookManagementAPI.bookManagementAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

        private final CategoryService categoryService;

        @Autowired
        public CategoryController(CategoryService categoryService) {
            this.categoryService = categoryService;
        }

        //http://localhost:8081/categories
        @GetMapping("/categories")
        public List<Category> findAllCategories() {
            return categoryService.findAllCategories();
        }

        //http://localhost:8081/category/id=?
        @GetMapping("/category/{id}")
        public Category findCategoryById(@PathVariable("id") Long id) {
            return categoryService.findCategoryById(id);
        }


        //http://localhost:8081/add-category
        @PostMapping("/add-category")
        public String createCategory(Category category){
            categoryService.createCategory(category);
            return "redirect:/categories";
        }


        //http://localhost:8081/update-category/id=?
        @PutMapping("/update-category/{id}")
        public String updateCategory(@PathVariable("id") Long id) {
            categoryService.updateCategory(id);
            return "redirect:/categories";
        }

        //http://localhost:8081/remove-category/id=?
        @DeleteMapping("/remove-category/{id}")
        public String deleteCategory(@PathVariable("id") Long id) {
            categoryService.deleteCategory(id);
            return "redirect:/categories";
        }
}
