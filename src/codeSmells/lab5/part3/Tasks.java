package codeSmells.lab5.part3;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<String> tasksList;

    public Tasks() {
        this.tasksList = new ArrayList<>();
    }

    public void addTask(String task) {
        tasksList.add(task);
    }

    public void removeTask(String task) {
        tasksList.remove(task);
    }

    public List<String> getTasksList() {
        return tasksList;
    }
}