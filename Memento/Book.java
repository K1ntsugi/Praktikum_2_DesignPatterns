package Memento;

class Book {

    public class BookMemento {
        private final String state;

        public BookMemento(String stateToSave){
            state = stateToSave;
        }

        private String getSavedState(){
            return state;
        }
    }

    private String titel;
    private String inhalt;
    private int isbn;
    private String state;

    private BookMemento mem;

    public Book(){
        mem = new BookMemento("Erster Zustand");
    }

    public void set(String state){
        this.state = state;
        System.out.println("Buch: Setze Status auf: " + state);
    }

    public BookMemento saveToMemento(){
        System.out.println("Buch: Speichere in Memento");
        return new BookMemento(this.state);
    }

    public void restoreFromMemento(BookMemento memento){
        this.state = memento.getSavedState();
        System.out.println("Buch: Zustand nach Wiederherstellung des Zustands von Memento: " + state);
    }
}
