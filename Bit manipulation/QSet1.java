class QSet1{

    static void swapTwoNumber(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a : "+a+" and "+" b : "+b);
    }

    static boolean check(int n,int i){

        //return ((n & (1<<i)) !=0);   //using left shift

                //OR

        return ((n>>i & 1)!=0);        //using  right shift

        // TC-O(1) SC-O(1)
    }

    static void set(int n,int i){
        n=1<<i | n;
        System.out.println("n is "+n);
    }

    static void clear(int n,int i){
        n=n & ~(1<<i);
        System.out.println(n);
    }
    
    static void toggle(int n,int i){
        n=n^(1<<i);
        System.out.println(n);
    }

    static void remove(int n){
        n=n&(n-1);
        System.out.println(n);

    //     n= 1010100
    //    n-1=1010011
    //       =1010000   
    }

    static void powerOf2(int n){
        int chk=n&(n-1);
        if(chk==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }

        //power of 2 means there will be only 1 set bit
    }

    static void countBits(int n){
        int cnt=0;

        //M-1
        // while(n!=0){
        //     cnt+=n%2;
        //     n/=2;
        // }

        //M-2
        while(n!=0){
            cnt+=n&1;     //n&1==1 means n is odd
            n=n>>1;
        }

        //M-3
        // while(n!=0){
        //     n=n&(n-1);
        //     cnt++;
        // }

        System.out.println("Count of set bit is "+cnt);
    }
    
    public static void main(String[] args) {

        //swapping 2 numbers without using 3rd variable
        int a=10,b=20;
        swapTwoNumber(a,b);  
        
        //check if the ith bit is set or not
        int n=13,i=2;
        check(n,i);
        System.out.println(check(n,i));

        //set ith bit
        int n1=13,i1=1;
        set(n1,i1);

        //clear ith bit
        int n2=13,i2=2;
        clear(n2,i2);

        //toggling the ith bit
        int n3=13,i3=2;
        toggle(n3,i3);

        //remove the last set bit(101010 -> 101000)
        int n4=15;
        remove(n4);

        //check if the number is power of 2
        int n5=16;
        powerOf2(n5);

        //count the number of set bits
        int n6=33;
        countBits(n6);
    }
}