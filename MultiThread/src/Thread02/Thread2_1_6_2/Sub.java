package Thread02.Thread2_1_6_2;

import Thread02.Thread2_1_6_2.Main;

public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try{
            while(i>0){
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
