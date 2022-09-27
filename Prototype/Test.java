package Prototype;

public class Test {
    public static void main(String[] args) {
        HospitalEmployee e1 = new HospitalEmployee("Arzt", "Max", "Mustermann", new Address("Musterstraße", "1", "9999", "Entenhausen"), "blabla");
        HospitalEmployee e2 = e1.clone();

        e2.setNachname("König");
        e2.setVorname("Frazi");

        System.out.println(e1.getVorname() + " " + e1.getNachname());
        System.out.println(e2.getVorname() + " " + e2.getNachname());
    }
}
