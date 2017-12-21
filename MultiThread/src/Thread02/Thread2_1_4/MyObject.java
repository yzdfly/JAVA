package Thread02.Thread2_1_4;

public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin MethodA, current Thread is " +Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void methodB(){
        try{
            System.out.println("begin MethodB, current Thread is " +Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
