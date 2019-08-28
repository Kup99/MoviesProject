package my.movies.project.dao;

import my.movies.project.mapper.MovieMapper;
import my.movies.project.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired

    JdbcTemplate jdbcTemplate;


    public List<Movie> getAllMovies() {
        String sql = "Select * from movies";
        return jdbcTemplate.query(sql, new MovieMapper());
    }

    public void update(Movie movie) {
        String sql = "Update movies SET name=?,year=?,genre=?,director=? WHERE id=?";
        jdbcTemplate.update(sql, movie.getName(), movie.getYear(), movie.getGenre(), movie.getDirector(), movie.getId());
    }

    public void getMovie(Long id) {
        String sql = "Select * from movies WHERE id=" + id;
        jdbcTemplate.query(sql, new MovieMapper());
    }

    public void add(Movie movie) {
        String sql = "INSERT INTO movies(name,year,genre,director) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, movie.getName(), movie.getYear(), movie.getGenre(), movie.getDirector());
    }


    public void delete(Long id) {
        String sql = "DELETE FROM movies WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

}

