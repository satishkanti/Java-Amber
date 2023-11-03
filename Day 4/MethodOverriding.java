class Bank{
    public void printInfo(){
        System.out.println("Loan Percentage for the Current Year is 5%\n");
    }
}

class SBI extends Bank{
    public void printInfo(){
         System.out.println("Loan Percentage for the Current Year is 7%\n");
    }
}

class HDFC extends Bank{
    public void printInfo(){
        System.out.println("Loan Percentage for the Current Year is 8%\n");
    }
}

class ICICI extends Bank{
    public void printInfo(){
        System.out.println("Loan Percentage for the Current Year is 7.5%\n");
    }
}

class MehtodOverriding{
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.printInfo();
        Bank b2 = new SBI();
        b2.printInfo();
        Bank b3 = new HDFC();
        b3.printInfo();
        Bank b4 = new ICICI();
        b4.printInfo();
    }
}