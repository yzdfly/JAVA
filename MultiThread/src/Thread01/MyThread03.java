package Thread01;

/**
 * Page 6
 */
public class MyThread03 extends Thread{
    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("Run = "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
