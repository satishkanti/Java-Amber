package Student_Example;

public class Student implements Comparable<Student>{
    
    private int roll_no;
    private int age;
    private String name;

    public Student(int roll_no, int age, String name){
        // super();
        this.roll_no = roll_no;
        this.age = age;
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student o) {
       return this.roll_no-o.roll_no;
    }
    
}
