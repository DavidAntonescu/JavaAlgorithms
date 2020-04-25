package Maths;

/*In number theory, a perfect number is a positive integer that is equal to the sum of
 *its positive divisors, excluding the number itself. For instance, 6 has divisors 1, 2 and 3
 *(excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
 *link:https://en.wikipedia.org/wiki/Perfect_number*/

public class PerfectNumber {
    public static void main(String[] args) {
        assert isPerfectNumber(6); /* 1 + 2 + 3 == 6 */
        assert !isPerfectNumber(8); /* 1 + 2 + 4 != 8 */
        assert isPerfectNumber(28); /* 1 + 2 + 4 + 7 + 14 == 28 */
    }

    /*Checks if the number is a perfect number or not*/
    public static boolean isPerfectNumber(int number) {
        int sum = 0;  /* sum of its positive divisors */
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
