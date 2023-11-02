class RBI{
    public void printInfo(){
        System.out.println("Regulatory body of all banks");
    }
}

class SBI extends RBI{
    public void sbi(){
        System.out.println("State Bank of India\n");
    }
}

class HDFC extends RBI{
    public void hdfc(){
        System.out.println("Housing Development Finance Corporation\n");
    }
} 

public class HierarchicalInheritance {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        s1.printInfo();
        s1.sbi();

        HDFC h1 = new HDFC();
        h1.printInfo();  
        h1.hdfc();
    }
}
