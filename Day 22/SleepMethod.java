public class SleepMethod extends Thread{

    public void run(){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
    public static void main(String[] args) {
        SleepMethod s1 = new SleepMethod();
        s1.start();
    }
}
