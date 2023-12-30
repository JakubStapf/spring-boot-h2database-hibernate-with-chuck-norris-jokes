package pl.juniortesterjava.project.speakjokes.controller;

import pl.juniortesterjava.project.speakjokes.service.VoiceRssService;

import java.io.IOException;
import java.util.logging.Logger;

public class VoiceRssController {
    private static final Logger LOGGER = Logger.getLogger(VoiceRssController.class.getName());

    private final VoiceRssService voiceRssService;

    public VoiceRssController(VoiceRssService voiceRssService) {
        this.voiceRssService = voiceRssService;
    }

    public boolean play(String textToVoice) throws IOException {
        LOGGER.info("play(" + textToVoice + ")");
        boolean spoken = voiceRssService.speakJoke(textToVoice);
        LOGGER.info("play(...) = " + spoken);
        return spoken;

    }

}
