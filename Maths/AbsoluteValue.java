package Maths;

public class AbsoluteValue {

    public static void main(String[] args) {
        int value = -34;
        System.out.println("The absolute value of " + value + " is " + absVal(value));
    }
    
    public static int absVal(int value) {
        return value < 0 ? -value : value;
    }
}
