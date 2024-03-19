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
    public static void main(String[] args) {

        //swapping 2 numbers without using 3rd variable
        int a=10,b=20;
        swapTwoNumber(a,b);  
        
        //check if the ith bit is set or not
        int n=13,i=2;
        check(n,i);

    }
}