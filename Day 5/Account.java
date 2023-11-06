public class Account {
    private int accNo;
    private int IFSCCode;
    protected String location;
    protected String email;
    double amount = 45000.456;
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public int getIFSCCode() {
        return IFSCCode;
    }
    public void setIFSCCode(int iFSCCode) {
        IFSCCode = iFSCCode;
    }

    protected void info(){
        System.out.println("The information is protected safely inside account class\n");
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccNo(7345);
        a1.setIFSCCode(2718);
        a1.getAccNo();
        a1.getIFSCCode();
        a1.location = "Bengaluru";
        a1.email = "satishkanti@gmail.com";
        System.out.println("Account Number: " + a1.getAccNo());
        System.out.println("IFSC Code: " + a1.getIFSCCode());
        System.out.println("Email: " + a1.email);
        System.out.println("Location: " + a1.location);
        System.out.println("Amount: " + a1.amount);
    }
}
