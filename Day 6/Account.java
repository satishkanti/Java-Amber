public class Account implements Bank{

    @Override
    public void credit() {
        System.out.println("XXXX amount credited to your account");
    }

    @Override
    public void debit() {
        System.out.println("XXXX amount debited from your account");
    }

    public static void main(String[] args) {
        Account b1 = new Account();
        b1.credit();
        b1.debit();
    }

    @Override
    public void loan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loan'");
    }
    
}
