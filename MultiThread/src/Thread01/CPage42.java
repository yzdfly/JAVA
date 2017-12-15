package Thread01;

public class CPage42 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000; i++){
            Thread.yield();
            count = count + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("use time " + (endTime - beginTime) + "mills");
    }
}
