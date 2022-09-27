package Builder;

public class TestClass {
    public static void main(String[] args) {
        Builder builder = new SteinhausBuilder();
        Director director = new Director(builder);
        director.construct();
        Haus result = builder.getResult();
        System.out.println(
                "Material des Hauses ist: " + result.getMaterial() + " und hat eine Keller: " + result.getKeller());
    }

}
