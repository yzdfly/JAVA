package Thread02.Thread2_1_4;

public class Run {
    public static void main(String[] args){
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        ThreadA threadB = new ThreadA(object);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadA.start();
        threadB.start();
    }
}
