//Maximum Points You Can Obtain from Cards
// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
// Your score is the sum of the points of the cards you have taken.
// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

class Question1{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,1};
        int k=3;
        int ans=maxScore(arr, k);
        System.out.println(ans);
    }
    static int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rindex];
            maxsum=Math.max(maxsum,lsum+rsum);
            rindex--;
        }
        return maxsum;
    }
}

// TC - O(2*k)
// Sc - O(1)