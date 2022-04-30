package com.bookManagementAPI.bookManagementAPI.repository;

import com.bookManagementAPI.bookManagementAPI.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}