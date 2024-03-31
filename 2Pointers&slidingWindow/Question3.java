// Max Consecutive Ones III
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class Question3 {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int ans=longestOnesM2(arr, k);
        System.out.println(ans);
    }
    static int longestOnesM3(int[] nums, int k) {
        //Method-3
        //TC - O(n)
        //SC - O(1)

        int n=nums.length;
        int maxl=0;
        int left=0,right=0;
        int zeros=0;
        while(right<n){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                maxl=Math.max(maxl,right-left+1);
            }
            right++;
        }
        return maxl;
    }
    static int longestOnesM1(int[] nums, int k) {
        //Method-1
        //TC - O(n*n)
        //SC - O(1)

        int n=nums.length;
        int maxl=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    maxl=Math.max(maxl,j-i+1);
                }
                else{
                    break;
                }
            } 
        }
         return maxl;
    }
}
