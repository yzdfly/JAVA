package Thread02.Thread2_1_5;

public class PublicVar {
    public String userName = "A";
    public String passWord = "AA";

    synchronized public void setValue(String userName,String passWord){
        try {
            this.userName = userName;
            Thread.sleep(5000);
            this.passWord = passWord;
            System.out.println("setValue method thread name is " + Thread.currentThread().getName()
            + ";userName " + userName + ";passWord " + passWord);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void getValue(){
        System.out.println("getValue method thread name is " + Thread.currentThread().getName()
                + ";userName " + userName + ";passWord " + passWord);
    }

}
