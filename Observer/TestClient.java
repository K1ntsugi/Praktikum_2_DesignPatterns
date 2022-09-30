package Observer;

public class TestClient {
    public static void main(String[] args) {
        Newsletter n = new Newsletter();
        n.setTitel("Nürnberger Nachrichten");
        System.out.println(n.getTitel());
        n.setAusgabe("Oktober");
        n.setContent("Lorem ipsum dolor sit amtet....");

        Abbonent a = new Abbonent();
        n.meldeAn(a);



        System.out.println(a.aktualisiere());

    }
}
