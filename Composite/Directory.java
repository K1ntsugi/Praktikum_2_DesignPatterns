package Composite;

//Müsste eigentlich laut Aufgabenstellung "Lerneinheit" heißen
public abstract class Directory {
    protected String name;
    private int id = 0;
    private String timestamp;
    private String size;

    public Directory(int id){
        this.id = id;
        if(id == 0) name = "root";
    }

    public abstract void draw();
}
