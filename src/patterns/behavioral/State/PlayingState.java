package patterns.behavioral.State;

public class PlayingState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Pausing the music.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Stopping the music.");
        player.setState(new StoppedState());
    }
}