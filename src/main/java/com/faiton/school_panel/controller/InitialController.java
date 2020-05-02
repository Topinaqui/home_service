package com.faiton.school_panel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.faiton.school_panel.model.News;
import com.faiton.school_panel.model.School;
import com.faiton.school_panel.repository.NewsRepository;

@CrossOrigin( origins = "*", allowedHeaders = "*" )
@RestController
public class InitialController {

  @Autowired
  private NewsRepository repository; 
  
  @GetMapping("/news")
  public List<News> getAllNews() {
    return repository.findAll();
  }

@GetMapping("/news/{id}")
  public News getNewsById(@PathVariable("id") Long id) {
    return  repository.findById(id).orElse(new News());
  }
  
}