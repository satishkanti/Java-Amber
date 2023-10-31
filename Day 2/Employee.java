class Employee{

    String name;
    int age;
    String dept;
    double salary;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.dept);
        System.out.println(this.salary);
    }


    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Satish";
        e1.age = 23;
        e1.dept = "ISE";
        e1.salary = 500000.3848;
        e1.printinfo();
        
    }
}