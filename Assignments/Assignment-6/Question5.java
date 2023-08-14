public class Question5 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,2};
        int n = arr.length;
        int [] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int [] suffixSum = new int[n];

        suffixSum[n-1] = arr[n-1];

        for (int i = n-2; i>=0 ; i--) {
            suffixSum[i] = suffixSum[i+1] +arr[i];
        }

        int ans = -1;

        for (int i = 0 ; i < n ; i++){
            if(prefixSum[i]==suffixSum[i]){
               ans = i+1;
            }
        }
        System.out.println(ans);



    }
}
