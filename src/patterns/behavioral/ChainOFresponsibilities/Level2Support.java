package patterns.behavioral.ChainOFresponsibilities;

public class Level2Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 2) {
            System.out.println("Level 2 Support: Handling request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}