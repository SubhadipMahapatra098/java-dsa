
public class tute7arrayq1 {
    public static void main(String[] args) {
        int[] original = {4,5,7,9};
        int [] updated = new int [original.length+1];
        int insertIndex = 2;
        int insertValue = 17;
        for (int i=0,j=0;i<updated.length;i++) {
            if (i== insertIndex) {
                updated[i] = insertValue;
            }
            else {
                updated [i]= original[j++];
            }
        }
        for(int num :updated) {
            System.out.print(num);
        }
    }
}
