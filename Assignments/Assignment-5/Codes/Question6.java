public class Question6 {


    //Problem Statement:
    /*
    Given an array of N distinct elements, the task is to
    find all elements in array except two greatest elements in sorted order.
     */

    public static void main(String[] args) {
        int [] arr = {2, 8, 7, 1, 5};
        int large = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println("The Large number is: "+ large);
        int sl = -1;
        for (int j = 0 ; j < arr.length; j++){
            if(arr[j]> sl && arr[j] < large){
                sl = arr[j];
            }
        }
        System.out.println("The second large is: "+sl);
        int ans = 1;

        for (int k = 0; k <arr.length ; k++) {

            if(arr[k] < sl ){
                 ans = arr[k];
                System.out.println(ans);
            }

        }



    }
}
