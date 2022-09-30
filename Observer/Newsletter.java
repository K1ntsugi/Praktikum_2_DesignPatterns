package Observer;


public class Newsletter extends Subject{
    String titel;
    String ausgabe;

    String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAusgabe() {
        return ausgabe;
    }

    public void setAusgabe(String ausgabe) {
        this.ausgabe = ausgabe;
    }

    @Override
    public String toString() {
        return "Newsletter{" +
                "titel='" + titel + '\'' +
                ", ausgabe='" + ausgabe + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
