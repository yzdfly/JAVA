package Thread01;

public class Run04 {
    public static void main(String[] args){
        for(int i = 0;i<10;i++){
            MyThread04 thread04 = new MyThread04(i);
            thread04.start();
        }
    }
}
