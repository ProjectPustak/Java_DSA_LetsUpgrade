
public class Question1 {
    public static void main(String[] args) {
        //Given an array A[] of size n. The task is to find the largest element in it.
        int [] arr = {1, 2, 0, 3, 2, 4, 5};
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Number is: "+max);
    }
}