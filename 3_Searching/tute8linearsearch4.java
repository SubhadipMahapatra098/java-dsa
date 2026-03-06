//the target string name found in a given array.
 class tute8linearsearch4 {
public static  int searchString (String[] arr, String target) {
    for (int i=0;i<arr.length;i++) {
        if (arr[i]== target){
            return i;
        }
    }
    return -1;
}

    public static void main (String [] args) {
        String[] arr = {"Riya","Dip","Subhadip","Sayan"};
        String target = "Subhadip";
        int result = searchString (arr,target);
        System.out.println("the name is found at index :"  + result);
       

    }
}