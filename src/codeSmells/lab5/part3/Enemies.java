package codeSmells.lab5.part3;

import java.util.ArrayList;
import java.util.List;

public class Enemies {
    private List<String> enemiesList;

    public Enemies() {
        this.enemiesList = new ArrayList<>();
    }

    public void addEnemy(String enemy) {
        enemiesList.add(enemy);
    }

    public void removeEnemy(String enemy) {
        enemiesList.remove(enemy);
    }

    public List<String> getEnemiesList() {
        return enemiesList;
    }
}
