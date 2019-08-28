package my.movies.project.service;

import my.movies.project.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MovieService {

    void add(Movie movie);

    List<Movie> getAllMovies();

    void update(Movie movie);

    void getMovie(Long id);

    void delete(Long id);


}
