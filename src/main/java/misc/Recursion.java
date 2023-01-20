package misc;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // Using this to demonstrate how recursion works on the call stack
    static long factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
