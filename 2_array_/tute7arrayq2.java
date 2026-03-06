//find the  maximum and minimum of th array givenby{3,8,11,25}
public class tute7arrayq2 {
    public static void main (String[] args ) {
        int[] arr = {3,8,11,25};
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }      
            }
            System.out.println("the maximum of the given array is :"+ max);
        }
    }

