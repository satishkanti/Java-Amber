class EmployeeLocation extends Employee{
    public static void main(String[] args) {
        EmployeeLocation el1 = new EmployeeLocation();
        el1.location = "Mysore";
        System.out.println("Employee Location: " + el1.location);
        el1.display();
    }
}