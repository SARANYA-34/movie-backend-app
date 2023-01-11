package com.nestdigital.moviebackendapp.dao;

import com.nestdigital.moviebackendapp.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
