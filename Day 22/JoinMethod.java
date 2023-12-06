public class JoinMethod extends Thread{
    
    public void run(){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(1500);
                System.out.println(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        JoinMethod j1 = new JoinMethod();
        JoinMethod j2 = new JoinMethod();
        JoinMethod j3 = new JoinMethod();

        j1.start();

        try{
            System.out.println("The current thread: " + Thread.currentThread().getName());
            j1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        j2.start();
        
        try{
            System.out.println("The current thread: " + Thread.currentThread().getName());
            j2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        j3.start();

        try{
            System.out.println("The current thread: " + Thread.currentThread().getName());
            j3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
