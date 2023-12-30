package pl.juniortesterjava.project.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.juniortesterjava.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;

import java.io.IOException;

class ChuckNorrisJokesServiceTest {

    @Test
    void run() throws IOException {
        //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);
        String url = "https://api.chucknorris.io/jokes/random";

        //when
        String response = chuckNorrisJokesService.getResponse(url);

        //then
        Assertions.assertNotNull(response, "response is NULL");
    }

    @Test
    void convert() {
        //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);

        //when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.convert("{\n" +
                "\"icon_url\" : \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\n" +
                "\"id\" : \"UnMcu3fIR2iWX8mWCaoFTQ\",\n" +
                "\"url\" : \"\",\n" +
                "\"value\" : \"Chuck Norris doesn't use a guard dog at his home. He relies on Brutus, who is absolutely lethal when it comes to prowlers and is considered to be the most badass attack rabbit in the world.\"\n" +
                "}");

        //then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }

    @Test
    void randomJoke() {
        //given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);

        //when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();

        //then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }
}