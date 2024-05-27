package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RobotRegistry {
    private Map<String, Robot> prototypes = new HashMap<>();

    public Robot getRobot(String type) {
        return prototypes.get(type).clone();
    }

    public void addPrototype(String type, Robot robot) {
        prototypes.put(type, robot);
    }
}
