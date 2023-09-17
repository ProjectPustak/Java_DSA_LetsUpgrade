public class Question3 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int n = nums.length;

        int totalSum = 0 ;
        for (int i = 0; i <n; i++) {
            int ans = 0;
            for (int j = i; j <n; j++) {
                ans = ans + nums[j];
                totalSum = totalSum+ans;
            }

        }
        System.out.println(totalSum);
    }
}
