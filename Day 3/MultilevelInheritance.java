class Shape{
    public void color(String color){
        System.out.println("The color is " + color);
    }
}
class Triangle extends Shape{
    public void area(double b, double h){
        double area = (0.5*b*h);
        System.out.println("The Triangle Area is " + area);
    }
}
class Circle extends Triangle{
    public void area(int r){
        double area = 3.14*r*r;
        System.out.println("The Circle Area is " + area);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.color("Blue");
        c1.area(3,5);
        c1.area(4);
    }
}
