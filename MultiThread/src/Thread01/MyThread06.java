package Thread01;

/**
 * Page 10
 */
public class MyThread06 extends Thread{
    private int count = 5;
    public MyThread06(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count>0){
            count--;
            System.out.println(this.getName()+"'s count is " + count);
        }
    }
}
