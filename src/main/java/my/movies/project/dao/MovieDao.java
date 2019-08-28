package my.movies.project.dao;

import my.movies.project.model.Movie;

import java.util.List;

/**
 * Created by 813632 on 26.08.2019.
 */
public interface MovieDao {

    void add(Movie movie);

    List<Movie> getAllMovies();

    void update(Movie movie);

    void getMovie(Long id);

    void delete(Long id);


}
