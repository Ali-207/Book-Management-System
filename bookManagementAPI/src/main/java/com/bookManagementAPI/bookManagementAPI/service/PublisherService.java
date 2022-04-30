package com.bookManagementAPI.bookManagementAPI.service;

import com.bookManagementAPI.bookManagementAPI.entity.Publisher;

import java.util.List;

public interface PublisherService {

    public List<Publisher> findAllPublishers();

    public Publisher findPublisherById(Long id);

    public void createPublisher(Publisher publisher);

    public void updatePublisher(Long id);

    public void deletePublisher(Long id);

}
