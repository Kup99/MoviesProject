CREATE DATABASE IF NOT EXISTS moviesDb;
use moviesDb;
CREATE TABLE IF NOT EXISTS movies(
movie_id int (20) NOT NULL AUTO_INCREMENT,
name VARCHAR (255) NOT NULL,
year int(4) NOT NULL,
genre VARCHAR(20),
director VARCHAR(255),
PRIMARY KEY (movie_id)
);

