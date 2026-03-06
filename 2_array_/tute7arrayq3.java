//find theminimum of th given array {4,8,11,25}
public class tute7arrayq3 {
    public static void main(String[] args) {
        int[] arr = {4,8,11,25};
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("the minimum of the given array is " + min);
    }
}
