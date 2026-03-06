class Solution {
    public int search(int[] nums, int target) {
        int start =0;
           int end = nums.length -1;
           while (start <= end ) {
            int mid = start +(end - start)/2;
            if (target > nums[mid]) {
                end = mid-1;
            }
            else if (target < nums[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
           }
           return -1;
      }

      public static void main(String[] args) {
        int nums[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0,};
        int target = 10;
        int result = search(nums,target) ;
        System.out.println(target + "exits in nums and its indes is " + result);
    }
}