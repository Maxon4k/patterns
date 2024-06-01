package patterns.behavioral.ChainOFresponsibilities;

public class Level3Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 3) {
            System.out.println("Level 3 Support: Handling request - " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}