public class Bank {

    String bank;
    int RegNo;
    String location;

    public void printinfo(){
        System.out.println(this.bank);
        System.out.println(this.RegNo);
        System.out.println(this.location);
    }

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.bank = "HDFC";
        b1.RegNo = 2718;
        b1.location = "Bengaluru";
        b1.printinfo();
    }
    
}
