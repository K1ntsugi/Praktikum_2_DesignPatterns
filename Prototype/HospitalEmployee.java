package Prototype;

public class HospitalEmployee extends Employee{

    private String arbeitszeiten;

    public HospitalEmployee(String position, String vorname, String nachname, Address address, String arbeitszeiten) {
        super(position, vorname, nachname, address);
        this.arbeitszeiten = arbeitszeiten;
    }

    public String getArbeitszeiten() {
        return arbeitszeiten;
    }

    public void setArbeitszeiten(String arbeitszeiten) {
        this.arbeitszeiten = arbeitszeiten;
    }

    @Override
    public HospitalEmployee clone() {
        return (HospitalEmployee) super.clone();
    }
}
