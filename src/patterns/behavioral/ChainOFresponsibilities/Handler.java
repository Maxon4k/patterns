package patterns.behavioral.ChainOFresponsibilities;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(SupportRequest request);
}
