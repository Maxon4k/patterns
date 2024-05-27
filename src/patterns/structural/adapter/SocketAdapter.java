package patterns.structural.adapter;

public class SocketAdapter implements Socket {
    private EuropeanSocket socket;

    public SocketAdapter(EuropeanSocket socket) {
        this.socket = socket;
    }

    @Override
    public void plugIn() {
        socket.plugInEuropeanDevice();
    }
}