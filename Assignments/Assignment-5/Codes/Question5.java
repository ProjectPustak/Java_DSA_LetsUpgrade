public class Question5 {
    public static void main(String[] args) {
        //Given an array Arr of size N, print second
        // large distinct element from an array.

        int[] arr = {12, 35, 1, 10, 34, 1};
        int large = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The Large Number is: "+large);
        int sl = -1;
        for (int j = 0; j <arr.length ; j++) {

            if (arr[j] > sl && arr[j]!=large){
                sl=arr[j];
            }
        }
        System.out.println("The Second Large Number is: "+sl);
    }

}
