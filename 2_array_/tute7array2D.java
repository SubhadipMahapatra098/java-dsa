import java.util.*;

public class tute7array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column:");
        int row = sc.nextInt();
        int clm = sc.nextInt();

        int[][] numberMatrix = new int[row][clm];

        System.out.println("Enter values:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < clm; j++) {
                numberMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < clm; j++) {
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}