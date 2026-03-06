//target element 10 in a decending order shorted array given by {100, 90,80, 70, 60, 50, 40, 30, 20, 10, 0};
class tute9binarysearch2 {
      public static int searchBinary (int[] arr, int target) {
           int start =0;
           int end = arr.length -1;
           while (start <= end ) {
            int mid = start +(end - start)/2;
            if (target > arr[mid]) {
                end = mid-1;
            }
            else if (target < arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
           }
           return -1;
      }

      public static void main(String[] args) {
        int arr[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0,};
        int target = 10;
        int result = searchBinary(arr, target);
        System.out.println("The number "+ target + "  is found at index : " + result);
      }
     /*  public static int searchBinary (int[] arr, int target) {
           int start =0;
           int end = arr.length -1;
           while (start <= end ) {
            int mid = start +(end - start)/2;
            if (target > arr[mid]) {
                end = mid-1;
            }
            else if (target < arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
           }
           return -1;
      } */
}