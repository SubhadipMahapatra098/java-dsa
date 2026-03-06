//target number occurs how many times.given array is (1,2,3,5,3,6,7,3,8,3,3,3,3,0,3,9).
public class tute8linearsearch3 {
    public static int countOcarations(int[] arr,int target) {
            int count =0;
            for (int num:arr) {
                if(num == target) {
                    count++;
                }
            }
            return count ; 
           
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,3,6,7,3,8,3,3,3,3,0,3,9};
        int target = 3;
        int count = countOcarations(arr, target);
        if (count == 0) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("number " + target + " occurs "+ count + " times ");
        }
    }
}
