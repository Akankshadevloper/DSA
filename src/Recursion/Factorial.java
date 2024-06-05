package Recursion;

public class Factorial {
    public static int CalcFactorial(int n ){
    if(n== 1 || n== 0){
        return 1;
    }
    int fact_nm1 =  CalcFactorial(n-1);
    int fact_n = n*fact_nm1;
    return fact_n ;

    }

    public static void main(String args[] ){
      int n = 5;
      int ans = CalcFactorial(n);
        System.out.println(ans);
    }
}
