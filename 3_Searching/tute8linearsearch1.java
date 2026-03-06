//this is without usinng function.
public class tute8linearsearch1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target =5;
        int index = -1;
        for (int i=0; i<arr.length;i++) {
            if(arr[i]==target) {
                index = 1;
                break;
            }
        }
        if (index == -1) {
             System.out.println("the element is not found");
        }
        else {
            System.out.println("the element is found at index : "+ index);
        }
    }
}
