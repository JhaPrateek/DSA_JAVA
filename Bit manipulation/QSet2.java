
//Minimum Bit Flips to Convert Number

public class QSet2 {

    static int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int cnt=0;
        while(ans!=0){
            cnt+=ans&1;
            ans=ans>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int start=10,goal=7;
        int count=minBitFlips(start,goal);
        System.out.println(count);

        //Explanation
        // 10 - 01010;
        //  7 - 00111;

        // Total flip = 3;
        // Islea pehel xor kie dono ka to jaha jaha different hoga wo 1 ho jayega xor ki wjs se uske baad 1 ko count krlenge wahi number of flips hoga. 
    }
}
