public class Question6 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        int n = nums.length;

        int [] prefixStart = new int[n];

        int [] prefixEnd = new int[n];




        prefixStart[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixStart[i] = prefixStart[i-1] * nums[i];
        }

        System.out.println("Prefix Start: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(prefixStart[i]+" ");
        }



        prefixEnd[n-1]  = nums[n-1];

        for (int i = n-2 ; i >=0; i--){
            prefixEnd[i] = prefixEnd[i+1] * nums[i];
        }

        System.out.println("Prefix End: ");
        for (int i = 0; i < n ; i++) {
            System.out.print(prefixEnd[i]+" ");
        }


        int [] result = new int[n];
        result[0] = prefixEnd[1];
        result[n-1] = prefixStart[n-2];

        for (int i = 1; i < n-1 ; i++) {

            result[i] = prefixStart[i-1] * prefixEnd[i+1];
        }

        for (int i = 0; i <nums.length ; i++) {

            System.out.print(" "+result[i]);
        }






    }
}
