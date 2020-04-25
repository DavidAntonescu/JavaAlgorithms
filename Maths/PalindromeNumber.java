package Maths;

public class PalindromeNumber {
    public static void main(String[] args) {

        assert isPalindrome(12321);
        assert !isPalindrome(1234);
        assert isPalindrome(1);
    }

    /* Checks if n is a palindrome number or not*/
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(number + "");
        }
        int numberCopy = number;
        int reverseNumber = 0;
        while (numberCopy != 0) {
            int remainder = numberCopy % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            numberCopy /= 10;
        }
        return number == reverseNumber;
    }
}
