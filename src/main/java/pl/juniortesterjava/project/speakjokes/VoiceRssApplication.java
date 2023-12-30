import pl.juniortesterjava.project.speakjokes.controller.VoiceRssController;
import pl.juniortesterjava.project.speakjokes.service.AudioPlayService;
import pl.juniortesterjava.project.speakjokes.service.VoiceRssService;

import java.io.IOException;

public class VoiceRssApplication {
    public static void main(String[] args) throws IOException {
        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        VoiceRssController voiceRssController =new VoiceRssController(voiceRssService);


        boolean played = voiceRssController.play("Hello Joke!");

    }
}
