package com.springboot.movieApp.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Movie {
	
	@Id
	private int movieId;
	private String movieName;
	private String movieDescription;
	private LocalDateTime releaseDate;
	private String trailerUrl;
	private String coverPhotoUrl;
	private double duration;
	
}
