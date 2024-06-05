package Recursion;

public class StackHeight {
    public static int CalcPower(int x, int n){
        if(n==0){   // base case 1
            return 1;
        }
        if(x==0){    // base case 2
            return 0;
        }

       int xPownm1 = CalcPower(x, n-1);  // work
       int xPown = x* xPownm1;
       return xPown;

    }
    public static void main(String[] args){
        int x =2 , n=5;
        int ans = CalcPower(x,n);
        System.out.println(ans);

    }
}
