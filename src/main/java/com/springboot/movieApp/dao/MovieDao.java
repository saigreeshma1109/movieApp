package com.springboot.movieApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.movieApp.entity.Movie;

public interface MovieDao extends JpaRepository<Movie,Integer>{

	
}
