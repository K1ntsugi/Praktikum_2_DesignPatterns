package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Book.BookMemento> savedStates = new ArrayList<>();


    public List<Book.BookMemento> getSavedStates() {
        return savedStates;
    }

    public void setSavedStates(List<Book.BookMemento> savedStates) {
        this.savedStates = savedStates;
    }
}
