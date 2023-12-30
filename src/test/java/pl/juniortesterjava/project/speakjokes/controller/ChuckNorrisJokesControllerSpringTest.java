package pl.juniortesterjava.project.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.juniortesterjava.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChuckNorrisJokesControllerSpringTest {

    @Autowired
    private ChuckNorrisJokesController chuckNorrisJokesController;

    @Test
    void randomJoke() {
        // given
        // ... NOTE: injected by Spring using @Autowired
        String url = "https://api.chucknorris.io/jokes/random";

        // when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();

        // then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");

    }
}