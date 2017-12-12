package Thread01;

/**
 * Page13
 */
public class LoginRun {
    public static void main(String[] args){
        Login01 a = new Login01();
        a.start();
        Login02 b = new Login02();
        b.start();
    }
}
