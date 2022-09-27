package Prototype;

public abstract class Employee implements Cloneable{
    String position;
    String vorname;
    String nachname;
    Address address;

    public Employee(String position, String vorname, String nachname, Address address) {
        //Position muss in Hospital Employee
        this.position = position;
        this.vorname = vorname;
        this.nachname = nachname;
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Address getAddress() {
        return address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            clone.address = (Address) clone.address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
