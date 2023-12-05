class InvalidException extends Exception {

    InvalidException(String str){
        super(str);
    }
}

public class  UserRegistered{

    static void Reg_No(int reg_no)throws InvalidException{
        if(reg_no<1000){
            throw new InvalidException("Invalid Register Number.....!");
        }else{
            System.out.println("Valid User");
        }
    }
    public static void main(String[] args) {
        
        try{
            Reg_No(789);
        }
        catch(InvalidException e){
            System.out.println("Exception caught.....!");
            System.out.println(e);
        }
    }
}