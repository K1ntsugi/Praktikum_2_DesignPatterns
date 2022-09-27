package AbstractFactory;

class TestClass {
    public static void main(String[] args) {
        QuadroCompany fabrik = new QuadroCompany();
        ControllerBoard controller = new ControllerBoard(fabrik);
    }
}