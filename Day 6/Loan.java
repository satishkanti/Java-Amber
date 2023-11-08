public class Loan implements Bank{

    @Override
    public void credit() {
        
        throw new UnsupportedOperationException("Unimplemented method 'credit'");
    }

    @Override
    public void debit() {
        
        throw new UnsupportedOperationException("Unimplemented method 'debit'");
    }

    @Override
    public void loan() {
        System.out.println("XXXXXX amount is due on your loan account");
    }
    public static void main(String[] args) {
        Loan l1 = new Loan();
        l1.loan();
    }
    
}
