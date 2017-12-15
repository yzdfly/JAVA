package Thread01;

public class CPage30 extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            //System.out.println("this.isInterrupted() " + this.isInterrupted());
            System.out.println("Thread.currentThread().isInterrupted() " + Thread.currentThread().isInterrupted());
            Thread.sleep(20000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("Stop in sleeping,Interruption is " + Thread.currentThread().isInterrupted());
            e.printStackTrace();
        }
    }
}
