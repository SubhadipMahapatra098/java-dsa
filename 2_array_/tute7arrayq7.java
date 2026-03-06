//copy an array from a another array
public class tute7arrayq7 {
    public static void main(String[] args) {
        int originalArr[] ={3,4,5,6};
        int[] copyArr = new int[originalArr.length];
        for ( int i=0;i<copyArr.length; i++) {
            copyArr[i]= originalArr[i];
        }
        for(int num:copyArr) {
            System.out.print(num);
        }
    }
}
