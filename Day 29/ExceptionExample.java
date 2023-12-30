class OddNumberException extends Exception{
    OddNumberException(String str){
        super(str);
    }
}

public class ExceptionExample {
    static void checkForEvenNumber(int number) throws OddNumberException{
        if(number%2!=0){
            throw new OddNumberException("OddNumberException: The number must be even.");
        }else{
            System.out.println("The number is even!");
        }
    }

    public static void main(String[] args) {
        try {
            int evenNumber = 6;
            checkForEvenNumber(evenNumber);

            int oddNumber = 7;
            checkForEvenNumber(oddNumber);
        } catch (OddNumberException e) {
            e.printStackTrace();
        }
    }
    
}