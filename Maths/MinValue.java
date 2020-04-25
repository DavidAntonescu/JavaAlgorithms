package Maths;

public class MinValue {

    /*Returns the smaller of two int values.*/
    public static int min(int a, int b) {
        return a <= b ? a : b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.format("min:%d between %d and %d", min(a, b), a, b);
    }
}
