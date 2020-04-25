package Maths;

import java.util.Arrays;

public class AbsoluteMax {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, -10, -2};
        System.out.println("absMax(" + Arrays.toString(numbers) + ") = " + absMax(numbers));
    }

    public static int absMax(int[] numbers) {
        int absMaxValue = numbers[0];
        for (int i = 1, length = numbers.length; i < length; ++i) {
            if (Math.abs(numbers[i]) > Math.abs(absMaxValue)) {
                absMaxValue = numbers[i];
            }
        }
        return absMaxValue;
    }
}
