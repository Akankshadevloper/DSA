package Recursion;

public class StackHeight2 {

    public static int printLog(int x, int n  ){
       if(n==0){
           return 1;
       }
       if(x==0){
           return 0;
       }
       // if n is even
        if(n%2==0){
            return printLog(x, n/2)*printLog(x,n/2);
        }
        else{
            return printLog(x, n/2)* printLog(x,n/2)*x;
        }
    }


    public static void main(String[] args){
        int x =2 , n=5;
        int ans = printLog(x,n);
        System.out.println(ans);

    }
}
