class Shape{
    public void color(String color){
        System.out.println("The color is " + color);
    }
}
class Triangle extends Shape{
    public void area(double b, double h){
        double area = (0.5*b*h);
        System.out.println("The Area is " + area);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color("red");
        t1.area(4, 6);
    }
     
}