import java.util.*;
public class tute2switch {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int button = sc.nextInt();
         switch (button){
            case 1 :  System.out.println("hellow");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("bonjor");
            break;
            default : System.out.println("invalid botton");
         }
     }
}
