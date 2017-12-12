package Thread01;

public class LoginThread {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void dopost(String username,String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
                passwordRef = password;
            }
            System.out.println("userName = " + usernameRef + ";passWord = " + password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
