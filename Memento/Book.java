package Memento;

class Book{

    public static class BookMemento extends Caretaker{
        private final String state;
        private String titel;
        private String inhalt;
        private int isbn;

        public String getState() {
            return state;
        }

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

    public Book(String titel, String inhalt, int isbn) {
        this.titel = titel;
        this.inhalt = inhalt;
        this.isbn = isbn;
        this.state = "Initialisiert";
    }

    public void setState(String state){
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
