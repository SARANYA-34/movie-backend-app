package com.nestdigital.moviebackendapp.Controller;

import com.nestdigital.moviebackendapp.Model.MovieModel;
import com.nestdigital.moviebackendapp.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieAd",consumes = "application/json",produces = "application/json")
    private String movieAd(@RequestBody MovieModel movie){
        System.out.println(movie.toString());
        dao.save(movie);
        return "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<MovieModel> Viewmovie(){
        return (List<MovieModel>)dao.findAll();
    }
}
