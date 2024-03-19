//Power set / Subsets
//Given an integer array nums of unique elements, return all possiblesubsets (the power set).

import java.util.ArrayList;
import java.util.List;

public class QSet3 {
    static List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        int subsets=1<<n;
        for(int i=0;i<subsets;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;

        //TC - 2^n*n
        //SC - 2^n*n
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};   //Output- [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

        List<List<Integer>> subsets=subsets(nums);
        System.out.println(subsets);


        //Explanantion

        // nums=[1,2,3]  n=3         

        // 1 mtlb lena hae 0 mtlb nai lena hae

        // 0 0 0 -> 0         ->  []
        // 0 0 1 -> 1         ->  [1]
        // 0 1 0 -> 2         ->  [2]
        // 0 1 1 -> 3         ->  [1,2]
        // 1 0 0 -> 4         ->  [3]
        // 1 0 1 -> 5         ->  [1,3]
        // 1 1 0 -> 6         ->  [2,3]
        // 1 1 1 -> 7         ->  [1,2,3]

    }
}
