class TaxCalculator extends Exception{
    TaxCalculator(String str){
        super(str);
    }
    
}


public class CalculatorSimulator {
    static void calculateTax(String empName, boolean isIndian, double empSal)throws TaxCalculator{
        double taxAmount;
        if(!isIndian){
            throw new TaxCalculator("The employee should be an Indian citizen for calculating tax");
        }else{
            System.out.println(isIndian);
        }
        if(empName=="" || empName==null){
            throw new TaxCalculator("The employee name cannot be empty");
        }else {
            System.out.println(empName);
        }
        if(empSal>100000 && isIndian){
             taxAmount = empSal*8/100;
             System.out.println("Tax Amount is " + taxAmount);
        }
        if((empSal>=50000 && empSal<=100000) && isIndian){
            taxAmount = empSal*6/100;
            System.out.println("Tax Amount is " + taxAmount);
        }else if((empSal>=30000 && empSal<=50000) && isIndian){
            taxAmount = empSal*5/100;
            System.out.println("Tax Amount is " + taxAmount);
        }else if((empSal>=10000 && empSal<=30000) && isIndian){
            taxAmount = empSal*4/100;
            System.out.println("Tax Amount is " + taxAmount);
        }else
            throw new TaxCalculator("The employee does not need to pay tax");
        
    }
    public static void main(String[] args) {
        try{
            calculateTax("", true,3000);
            // System.out.println("Tax Amount is " + taxAmount);
        }
        catch(TaxCalculator e){
            e.printStackTrace(); 
        }
    }
}