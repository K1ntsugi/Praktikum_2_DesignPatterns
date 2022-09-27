package Builder;

public class Haus {
    private boolean Keller = false;
    private boolean Küche = false;
    private boolean Elektrik = false;
    private boolean Dach = false;
    private String Material;

    public void setKeller(boolean Keller) {
        this.Keller = Keller;
    }

    public void setKüche(boolean Küche) {
        this.Küche = Küche;
    }

    public void setElektrik(boolean Elektik) {
        this.Elektrik = Elektik;
    }

    public void setDach(boolean Dach) {
        this.Dach = Dach;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public boolean getKeller() {
        return Keller;
    }

    public String getMaterial() {
        return Material;
    }

}
