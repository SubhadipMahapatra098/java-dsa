import java.util.*;

public class tute2elseif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int botton = sc.nextInt();
        if (botton == 1) {
            System.out.println("hellow");
        } else {
            if (botton == 2) {
                System.out.println("Namaste");
            } else {
                if (botton == 3) {
                    System.out.println("Bonjor");
                } else {
                    System.out.println("invalid number");
                }
            }
        }
    }
}
