package patterns.behavioral.ChainOFresponsibilities;

public class Level1Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("Level 1 Support: Handling request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
