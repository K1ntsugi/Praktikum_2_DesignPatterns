package Command;

public class Konto{
    private String inhaber;
    private int password;
    private double saldo;
    private final double rahmenkredit = 1000D;

    public Konto(String inhaber){
        this.inhaber = inhaber;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRahmenkredit() {
        return rahmenkredit;
    }

    public void einzahlen(double betrag){
        this.saldo = saldo + betrag;
    }

    public void auszahlen(double betrag){
        double überzogen = saldo-betrag;
        if(überzogen < rahmenkredit){
            System.out.println("Auszahlung nicht möglich. Rahmenkredit ausgeschöpft");
        }
        this.saldo = saldo -betrag;


    }
}
