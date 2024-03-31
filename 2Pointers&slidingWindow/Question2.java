// Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest 
// substring without repeating characters.

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int ans=lengthOfLongestSubstringM2(s);
        System.out.println(ans);
    }
    static int lengthOfLongestSubstringM2(String s) {
        //Method-2
        // TC - O(n)
        // SC - O(256)

        int n=s.length();
        int l=0,r=0,maxl=0;
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            maxl=Math.max(maxl,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxl;
    }
    static int lengthOfLongestSubstringM1(String s) {
        //Method-1
        // TC - O(n*n)
        // SC - O(256)

        int n=s.length();
        int maxl=0;
        for(int i=0;i<n;i++){
            int hash[]=new int[256];
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]!=0){
                    break;
                }
                else{
                    maxl=Math.max(maxl,j-i+1);
                }
                hash[s.charAt(j)]=1;
            }
        }
        return maxl;
    }
}


// Logic of Method-2
// The logic is based on maintaining a sliding window that contains unique characters only. Whenever a repeating character is encountered, the left pointer is moved to the position after the last occurrence of that character, effectively excluding the previous occurrence from the current substring. This ensures that the sliding window always contains a substring without repeating characters, and the length of this substring is updated whenever a longer substring is found.