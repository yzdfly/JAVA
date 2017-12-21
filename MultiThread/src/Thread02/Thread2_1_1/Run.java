package Thread02.Thread2_1_1;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum instance = new HasSelfPrivateNum();
        HasSelfPrivateNum instance1 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(instance);
//        ThreadB threadB = new ThreadB(instance);
        ThreadB threadB = new ThreadB(instance1);
        threadA.start();
        threadB.start();
    }
}
