import java.util.*;
class DemoIO {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int val;

        System.out.print("Enter an integer: ");
        val  = keyboard.nextInt();
        System.out.print("2 times the value is:" + val*2);
    }
}
