package patterns.behavioral.State;

public interface State {
    void play(MusicPlayer player);
    void pause(MusicPlayer player);
    void stop(MusicPlayer player);
}