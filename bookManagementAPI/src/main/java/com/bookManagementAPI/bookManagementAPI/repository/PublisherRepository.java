package com.bookManagementAPI.bookManagementAPI.repository;

import com.bookManagementAPI.bookManagementAPI.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}