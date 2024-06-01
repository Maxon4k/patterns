package patterns.behavioral.State;

public class MusicPlayer {
    private State state;

    public MusicPlayer() {
        state = new StoppedState(); // Початковий стан
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.play(this);
    }

    public void pressPause() {
        state.pause(this);
    }

    public void pressStop() {
        state.stop(this);
    }
}