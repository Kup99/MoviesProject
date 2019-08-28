package my.movies.project.mapper;

import my.movies.project.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 813632 on 26.08.2019.
 */
public class MovieMapper implements RowMapper<Movie> {

    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        Movie movie=new Movie();
        movie.setName(rs.getString("name"));
        movie.setDirector(rs.getString("director"));
        movie.setGenre(rs.getString("genre"));
        movie.setYear(rs.getInt("year"));
        movie.setId(rs.getLong("id"));
        return movie;
    }
}
