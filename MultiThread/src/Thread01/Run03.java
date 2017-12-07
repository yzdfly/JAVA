package Thread01;

public class Run03 {
    public static void main(String[] args){
        MyThread03 thread03 = new MyThread03();
        thread03.setName("MyThread03");
        thread03.start();
        try{
            for(int i = 0; i < 10; i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("Main = "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
