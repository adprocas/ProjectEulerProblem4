package projecteulerproblem4;

public class ProjectEulerProblem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int x = 999; x > 0; x--) {
            for (int y = 999; y > 0; y--) {
                int multiple = x * y;
                if (isPalindrome(multiple) && multiple > largestPalindrome) {
                    largestPalindrome = multiple;
                }
            }
        }

        System.out.println(largestPalindrome);
    }

    /**
     * @param number
     * @return boolean
     */
    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    /**
     * @param number
     * @return int
     */
    public static int reverseNumber(int number) {
        int num = number;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        return reverse;
    }
}
