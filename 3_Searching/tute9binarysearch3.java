//at first find the order of array is in assending or decending oprder then find the value.
class tute9binarysearch {
    public static int searchB(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean assArray = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (assArray) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int result = searchB(arr, target);
        System.out.println("the number  " + target + " found at index : " + result);

    }
}