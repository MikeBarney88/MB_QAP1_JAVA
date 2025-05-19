public class TestTime {
    public static void main(String[] args) {

        // Initialize t1 and t2.
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set time to specs.
        t1.setTime(21,10,15);
        t2.setTime(10,20,25);

        // Display time using toString.
        System.out.println("Initial times:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
        System.out.println();

        // nextSecond for t1.
        t1.nextSecond();

        // previousSecond for t2.
        t2.previousSecond();

        // Display final time with toString.
        System.out.println("Final times:");
        System.out.println("t1 after nextSecond(): " + t1.toString());
        System.out.println("t2 after previousSecond(): " + t2.toString());
    }
}