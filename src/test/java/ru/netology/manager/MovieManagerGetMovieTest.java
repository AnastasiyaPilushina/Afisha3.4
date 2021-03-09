package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerGetMovieTest {
    MovieManager manager = new MovieManager();
    private Movie first = new Movie(1, "Bladshot", "action");
    private Movie second = new Movie(2, "Forward", "cartoon");
    private Movie third = new Movie(3, "Hotel Belgrade", "comedy");
    private Movie fourth = new Movie(4, "Gentlemen", "action");
    private Movie fifth = new Movie(5, "Invisible - Man", "horror");
    private Movie sixth = new Movie(6, "Trolls. World tour" , "cartoon");
    private Movie seventh = new Movie(7, "Number one", "comedy");
    private Movie eighth = new Movie(8, "Raya and the Last Dragon","cartoon");
    private Movie eight;


    @BeforeEach
    public void setUp() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eight);

    }




    @Test
    public void shouldGetFifth() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(eight);
        manager.addMovie(seventh);
        manager.addMovie(sixth);
        manager.addMovie(fifth);
        manager.addMovie(fourth);

        Movie[] expected = new Movie[] {fourth,fifth,sixth,seventh,eight};
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet7of7() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie(seventh);
        manager.addMovie(sixth);
        manager.addMovie(fifth);
        manager.addMovie(fourth);
        manager.addMovie(third);
        manager.addMovie(second);
        manager.addMovie(first);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[] {first,second,third,fourth,fifth,sixth,seventh};
        assertArrayEquals(expected,actual);


    }
    @Test
    void shouldAddNoFilm() {
        MovieManager manager = new MovieManager(0);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.getItems();
        assertArrayEquals(expected, actual);
    }






}

