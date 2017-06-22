package creational.adapter;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "blabla.mp3");
        audioPlayer.play("mp4", "blabla.mp4");
        audioPlayer.play("vlc", "blabla.vlc");
        audioPlayer.play("avi", "blabla.avi");
    }
}
