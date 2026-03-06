//find the  location of the target  element.given by the array is (1,2,3,4,5).
public class tute8linearsearch2 {
    public static int search(int[] arr,int target) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]== target) {
                return  i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int target = 5;
    int result = search(arr, target);
    if (result == -1) {
        System.out.println("element not found");
    }
    else {
        System.out.println("element found at index : " + result);
    }
   }
}
