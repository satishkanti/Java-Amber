class Person{
    String city = "Bengaluru";
    int uid = 84314;

    Person(){
        System.out.println(uid);
    }

    public void display(){
        System.out.println(city + " " + uid);
    }
}

class Student extends Person{
    String name = "Satish";
    String course = "Java";

    Student(){
        super();
        System.out.println(name + " " + course);
    }

    public void display(){
        super.display();
        System.out.println(super.uid + " " + super.city);
    } 
}




public class SuperKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
