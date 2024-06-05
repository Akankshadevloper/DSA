package Recursion;

public class RecursionClass1 {
    public static void printNumb(int n ){

        if (n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args){
        // Recursion a function that call itself is known as recursion or recursive function

        // iteration/loops , Function
        int n = 5;
        printNumb(n); //5
    }
}


// agar java mai recursive call hoga to +stack mai save hota h
