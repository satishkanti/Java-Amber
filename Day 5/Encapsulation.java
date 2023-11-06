class Employee{
    private int eid;
    public String ename;
    protected String location;
    String dept;
    
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }

    protected void display(){
        System.out.println("I'm protected inside class employee");
    }
}

class Encapsulation{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.ename = "Satish";
        e1.dept = "ISE";
        e1.location = "Bengaluru";
        e1.setEid(22);
        e1.getEid();
        System.out.println("Employee Name: " + e1.ename);
        System.out.println("Employee ID: " + e1.getEid());
        System.out.println("Employee Department: " + e1.dept);
        System.out.println("Employee Location: " + e1.location);
    }
}