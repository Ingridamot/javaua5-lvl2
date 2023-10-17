package lt.codeacademy.lv2.git;

public class P1GitApp {
    public static void main(String[] args) {

        System.out.println("hello");
        ifExample();

    }

    private static void ifExample() {
        //tenary operators  - ?:
        //int result = (5>3)? 5:3;
        final int daysValue =2;
        if (daysValue >= 1 && daysValue <=5){
            doWork();

        }else {
            doToRest();
        }

    }

    private static void doToRest() {
    }

    private static void doWork() {
    }
}
