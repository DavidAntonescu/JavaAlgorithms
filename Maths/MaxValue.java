package Maths;

public class MaxValue {

    /* Returns the greater of two int values.*/
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.format("max:%d between %d and %d", max(a, b), a, b);
    }
}
