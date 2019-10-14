class Hii extends ThreadDemo {
    public void show() {
        for(int i=1;i<=10;i++) {
            System.out.println("HII DIVYANSHU,WELCOME TO JAVA PROGRAMMING LANGUAGE");
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello extends ThreadDemo {
    public void show() {
        for(int i=1;i<=5;i++) {
            System.out.println("HELLO DIVYANSHU,WELCOME TO JAVA PROGRAMMING LANGUAGE");
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Hii divyanshu1=new Hii();
        Hello divyanshu2=new Hello();
        divyanshu1.show();
        divyanshu2.show();

    }

}