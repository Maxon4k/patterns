package patterns.behavioral.State;

public class StoppedState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Starting the music.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Music is already stopped. Can't pause.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Music is already stopped.");
    }
}
