package com.faiton.school_panel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faiton.school_panel.model.News;

public interface NewsRepository extends JpaRepository<News, Long> {

}
