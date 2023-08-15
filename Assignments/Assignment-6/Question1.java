public class Question1 {
    public static void main(String[] args) {
        int [] arr = {5, 5, 2, 5, 8};

        int n = arr.length;

        int [] even = new int[n];
        int [] odd = new int[n];

        even[0] = arr[0];
        odd[0] = 0;

        for (int i = 1 ; i < n ; i++){
            if(i%2==0){
                even[i] = even[i-1] + arr[i];
                odd[i] = odd[i-1];
            }
            else{
                odd[i] = odd[i-1] + arr[i];
                even[i] = even[i-1];
            }

        }
        int count = 0 ;

        for (int i = 0; i < arr.length ; i++) {
            int lEven = 0 ;

            int rEven = 0;
            int rOdd = 0;
            int lOdd= 0;

            if(i!=0){
                lEven = even[i-1];
                lOdd = odd[i-1];
            }

            rEven = odd[n-1] - odd[i];
            rOdd = even[n-1] - even[i];

            if ((lEven+rEven)==(lOdd+rOdd)){
                count++;
            }
        }
        System.out.println(count);



    }
}
