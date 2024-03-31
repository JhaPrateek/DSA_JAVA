// Fruit Into Baskets
// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array
//fruits where fruits[i] is the type of fruit the ith tree produces.
// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket 
//can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right.
//The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

import java.util.HashMap;
import java.util.HashSet;

public class Question4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2};
        int ans=totalFruitM3(arr);
        System.out.println(ans);
    }
    static int totalFruitM3(int[] fruits) {
        //Method-3
        //TC - O(n)
        //SC - O(1)

        int n=fruits.length;
        int l=0,r=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            if(map.size()<=2){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
    static int totalFruitM2(int[] fruits) {
        //Method-2
        //TC - O(n+n)
        //SC - O(1)

        int n=fruits.length;
        int l=0,r=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }
            else{
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
    static int totalFruitM1(int[] fruits) {
        //Method-1
        //TC - O(n*n)
        //SC - O(1) //even if we are using hashset,we are not storing more than 3 values so its a constant space

        int n=fruits.length;
        if(n==1){
            return 1;
        }
        int max=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(fruits[j]);
                if(set.size()<=2){
                    max=Math.max(max,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}


//Logic of method-2

// Initialize two pointers, l and r, to mark the left and right ends of a sliding window.
// Initialize a HashMap to store the types of fruits in the current window and their counts.
// Iterate through the array fruits:
// Increment the count of the current fruit (fruits[r]) in the HashMap.
// If the size of the HashMap exceeds 2, shrink the window from the left side until only 2 types of fruits remain.
// Update the maximum number of fruits (max) if the current window size is greater than the previous maximum.
// Move the right pointer (r) to expand the window.
// Return the maximum number of fruits.
