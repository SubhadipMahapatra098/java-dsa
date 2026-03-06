import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int row = sc.nextInt();
     int col = sc.nextInt();
     int arr1[][] = new int[row][col];
    int arr2[][] = new int[row][col];
    int multiplication[][] = new int[row][col];

    for(int i=0; i<row; i++) {
       for (int j=0;j<col;j++) {
        arr1[i][j] = sc.nextInt();
       }
        for (int j=0;j<col;j++) {
        arr2[i][j] = sc.nextInt();
       }
     for (int j=0;j<col;j++) {
        multiplication[i][j] = 0;
       
            multiplication[i][j] = arr1[i][j] * arr2[i][j];
        
        System.out.print(multiplication[i][j] + " ");
       }
    }

    }
      
}
