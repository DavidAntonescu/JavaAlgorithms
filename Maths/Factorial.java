package Maths;

//change around 'n' for different factorial results
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + factorial(n));
    }
    //Factorial = n! = n1 * (n-1) * (n-2)*...1

    /*Calculate factorial N*/
    public static long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("n < 0");     //Doesn't work with less than 0
        }
        long fac = 1;
        for (int i = 1; i <= n; ++i) {
            fac *= i;
        }
        return fac; //Return factorial
    }
}
