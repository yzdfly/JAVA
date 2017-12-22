package Thread02.Thread2_1_6;

public class Service {
    public void service1(){
        System.out.println("Service1");
        service2();
    }

    public void service2(){
        System.out.println("Service2");
        service3();
    }

    public void service3(){
        System.out.println("Service3");
    }
}
