package AbstractFactory;

class ControllerBoard {
    QuadcopterFabrik fabrik;

    Quadrocopter quadrocopter;

    public ControllerBoard(QuadcopterFabrik fabrik) {
        this.fabrik = fabrik;
        createProducts();
    }

    private void createProducts() {
        quadrocopter = quadrocopter.createQuadrocopter();
    }
}