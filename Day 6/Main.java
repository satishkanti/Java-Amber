public class Main implements Message{

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void applyColor() {
        System.out.println("Applying Yellow Color");
    }

    @Override
    public void printShape() {
        System.out.println("It is Triangle with Yellow color ");
    }
    
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.drawShape();
        m1.applyColor();
        m1.printShape();
    }

}
