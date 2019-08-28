package my.movies.project.service;

import my.movies.project.dao.MovieDao;
import my.movies.project.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    public MovieDao movieDao;


    public void add(Movie movie) {

        movieDao.add(movie);
    }

    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }


    public void update(Movie movie) {
        movieDao.update(movie);

    }

    public void getMovie(Long id) {
        movieDao.getMovie(id);
    }

    public void delete(Long id) {
        movieDao.delete(id);
    }
}

