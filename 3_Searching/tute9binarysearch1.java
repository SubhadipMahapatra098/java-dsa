//target the idex number of 10 of given arr ={3,8,9,10,15,25,30,45,90} which is shorted in assending order.
public class tute9binarysearch1 {
     public static int searchBinary (int arr[], int target) {
     int start =0;
     int end = arr.length -1;
     while (start <= end ) {
        int mid = start + (end - start)/2;
     
    if ( target > arr[mid]  ) {
        start= mid+1;
    }
    else if (target <arr[mid] ) {
        end = mid -1;
    }
    else {
        return mid;
    }
    }
    return-1;
} 


    public static void main(String[] args) {
        int arr[] = {3,8,9,10,15,25,30,45,90};
        int target = 10;
        int result =searchBinary(arr, target);
        System.out.println("the element "+ target + " is found at index : " + result);
    }
}