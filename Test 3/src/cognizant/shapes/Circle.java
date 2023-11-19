package cognizant.shapes;

public class Circle {
    private float radius;
    private float pi=3.5f;

    public Circle(){
        this.radius = 1.5f;
    }
    
    Circle(float radius){
        this.radius = radius;
    }

    Circle(float radius, float pi){
        this(radius);
        this.pi = pi;
    }

    public float getRadius() {
        return radius;
    }
    
    Circle(float radius, float pi, boolean packageAccess) {
        this.radius = radius;
        this.pi = pi;
    }

    public float calculateCircleArea(float radius) {
        return pi * radius * radius;
    }

    public float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        float area = c.calculateCircleArea(c.getRadius());
        float circumference = c.calculateCircumference(c.getRadius());

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

}
