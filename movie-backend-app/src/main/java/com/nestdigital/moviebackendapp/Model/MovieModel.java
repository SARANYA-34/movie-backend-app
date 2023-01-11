package com.nestdigital.moviebackendapp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int releasedYear;
    private String language;

    public MovieModel() {
    }

    public MovieModel(int id, String name, int releasedYear, String language) {
        this.id = id;
        this.name = name;
        this.releasedYear = releasedYear;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
