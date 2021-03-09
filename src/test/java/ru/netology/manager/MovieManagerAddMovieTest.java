package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerAddMovieTest {
    private MovieManager movieManager =new MovieManager();
    private Movie first = new Movie(1, "Bladshot", "action");
    private Movie second = new Movie(2, "Forward", "cartoon");

    @Test
    public void  shouldAddMovie() {
        movieManager.addMovie(first);
        movieManager.addMovie(second);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[] {second,first};
        assertArrayEquals(expected, actual);
    }
}