public class ExceptionHandlingEx {

    public static void main(String[] args) {
        
        System.out.println("Started.....");
        System.out.println("Enter two numbers: ");

        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Welcome.....");
            int result = num1/num2;
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        finally{
            System.out.println("Terminated.....");
        }
    }
}