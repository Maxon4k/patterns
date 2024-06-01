package patterns.behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    public void add(Memento state) {
        // Якщо ми додаємо новий стан, видаляємо всі майбутні стани
        if (currentIndex != mementoList.size() - 1) {
            mementoList = mementoList.subList(0, currentIndex + 1);
        }
        mementoList.add(state);
        currentIndex++;
    }

    public Memento undo() {
        if (currentIndex <= 0) {
            currentIndex = 0;
            return mementoList.get(currentIndex);
        }
        return mementoList.get(--currentIndex);
    }

    public Memento redo() {
        if (currentIndex >= mementoList.size() - 1) {
            currentIndex = mementoList.size() - 1;
            return mementoList.get(currentIndex);
        }
        return mementoList.get(++currentIndex);
    }
}