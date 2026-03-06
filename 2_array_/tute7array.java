import java.util.*;
public class tute7array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers =  new int[size];
        
        for (int i=0; i<=size; i++)
        for (int j=0; j<size; j++) {
            System.out.println(numbers[i]);
        }
    }
}
