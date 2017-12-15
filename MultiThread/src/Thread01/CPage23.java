package Thread01;

public class CPage23 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 50000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("Thread stop!");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i + 1));
            }
        }catch (InterruptedException e){
            System.out.println("Throw into InterruptedException");
        }
        System.out.println("run after for sentence");
    }
}
