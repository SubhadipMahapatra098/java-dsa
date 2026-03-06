import java.util.*;
class tute6function {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        // Special case for 0 and 1
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial is: " + result);
    }
}
