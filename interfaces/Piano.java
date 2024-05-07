package interfaces;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("playing the piano");
    }
}
