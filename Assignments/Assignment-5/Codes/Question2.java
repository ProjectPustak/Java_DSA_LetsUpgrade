public class Question2 {
    public static void main(String[] args) {
        //Find minimum and maximum element in an array
//        int [] arr = {3, 2, 1, 56, 10000, 167};
          int [] arr = {10, 345, 234, 21, 56789};
        int ans = min(arr);
        System.out.println("The Minimum Number is: "+ans);
    }


    //For Minimum Number I use this method Formula
    static int min(int[]arr){
        int minimum = arr[0];
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]<minimum){
                minimum =arr[i];
            }
        }
        int result = minimum;
        return result;

    }


    //For Getting Minimum I am Using This Formula

    static  int max(int[]arr){
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }


        }
        int result = max;
        return result;
    }
}
