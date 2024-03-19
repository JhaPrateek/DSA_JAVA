import java.util.*;

class Pattern{

    static void pattern1(int n){
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern2(int n){

        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern3(int n){

        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern4(int n){

        // 1 
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    
    static void pattern5(int n){

        // * * * * * 
        // * * * *
        // * * *
        // * *
        // *

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }    
    
    static void pattern6(int n){

        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){

    //     *    
    //    ***
    //   *****
    //  *******
    // *********

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void pattern8(int n){

        // *********
        //  ******* 
        //   *****  
        //    ***   
        //     *  

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void pattern9(int n){

        //     *    
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  ******* 
        //   *****  
        //    ***   
        //     *  

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void pattern10(int n){

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        for(int i=0;i<2*n;i++){
            int stars=i;
            if(i>=n){
                stars=2*(n-1)-i;
            }
            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){

        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int first=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                first=1;
            }
            else{
                first=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(first+" ");
                first=1-first;
            }
            System.out.println();
        }
    }

    static void pattern12(int n){

        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321

        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }

    static void pattern13(int n){

        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((count++)+" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){

        // A 
        // A B
        // A B C
        // A B C D
        // A B C D E

        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){

        // A B C D E 
        // A B C D
        // A B C
        // A B
        // A

        for(int i=n-1;i>=0;i--){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){

        // A 
        // B B
        // C C C
        // D D D D
        // E E E E E

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){

    //      A    
    //     ABA
    //    ABCBA
    //   ABCDCBA
    //  ABCDEDCBA

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                if(j<=breakpoint){
                    System.out.print(ch++);
                }
                else{
                    System.out.print(ch--);
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n){

        // E 
        // D E
        // C D E
        // B C D E
        // A B C D E

        for(int i=0;i<n;i++){ 
            for(char ch=(char) ('E'-i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){

        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****

        int iniS=0;
        for(int i=0;i<n;i++){
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }

        iniS=2*n-2;
        for(int i=0;i<n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();
        }
    }

    static void pattern20(int n){

        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *

        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2;
            else space+=2;
        }
    }

    static void pattern21(int n){

        // *****
        // *   *
        // *   *
        // *   *
        // *****

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){

        // 555555555
        // 544444445
        // 543333345
        // 543222345
        // 543212345
        // 543222345
        // 543333345
        // 544444445
        // 555555555

        for(int  i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=2*n-2-j;
                int bottom=2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=5;
        pattern20(n);
    }
}