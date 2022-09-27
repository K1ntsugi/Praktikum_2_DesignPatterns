package Prototype;

public class Address implements Cloneable{
    String ort;
    String strasse;
    String hausnummer;
    String plz;

    Address(String strasse, String hausnummer, String plz, String ort){
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }
    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
