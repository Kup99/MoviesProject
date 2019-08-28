package my.movies.project.config;

import my.movies.project.model.Genre;
import org.springframework.context.annotation.Bean;

public class GenreValuesConfig {

    @Bean
    public Genre[] getValues() {

        return Genre.values();
    }
}


