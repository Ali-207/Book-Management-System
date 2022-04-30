package com.bookManagementAPI.bookManagementAPI.controller;

import com.bookManagementAPI.bookManagementAPI.entity.Publisher;
import com.bookManagementAPI.bookManagementAPI.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublisherController {

    private final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    //http://localhost:8081/publishers
    @RequestMapping("/publishers")
    public List<Publisher> findAllPublishers() {
        return publisherService.findAllPublishers();
    }

    //http://localhost:8081/publisher/id=?
    @GetMapping("/publisher/{id}")
    public Publisher findPublisherById(@PathVariable("id") Long id) {
        return publisherService.findPublisherById(id);
    }

    //http://localhost:8081/add-publisher
    @PostMapping("/add-publisher")
    public String createPublisher(Publisher publisher) {
        publisherService.createPublisher(publisher);
        return "redirect:/publishers";
    }

    //http://localhost:8081/update-publisher/id=?
    @PutMapping("/update-publisher/{id}")
    public String updatePublisher(@PathVariable("id") Long id){
        publisherService.updatePublisher(id);
        return "redirect:/publishers";
    }

    //http://localhost:8081/remove-publisher/id=?
    @DeleteMapping("/remove-publisher/{id}")
    public String deletePublisher(@PathVariable("id") Long id) {
        publisherService.deletePublisher(id);
        return "redirect:/publishers";
    }
}
