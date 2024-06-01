package patterns.behavioral.State;

public class PausedState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Resuming the music.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Stopping the music from pause.");
        player.setState(new StoppedState());
    }
}
