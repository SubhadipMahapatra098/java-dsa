//average of a given array {4'8'11'25}
 public class tute7arrayq5 {
    public static void main(String[] args) {
        int arr[]= {4,8,11,25};
        int sum = 0;
        int average = 0;
        for (int num:arr) {
            sum += num;
        }
        average = sum/arr.length;
        System.out.println("the average of the array is"+ average);
    }
}
