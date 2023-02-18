package recursion;

import static recursion.HomeworkRecursion.*;

public class HomeworkRecursion {

    public static String isPowerOfTwo(double n) {
        if (n == 1) {
            return "YES";
        }
        else if (n < 1) {
            return "NO";
        }
        else {
            return isPowerOfTwo(n / 2);
        }
    }


    public static int sumOfDigits(int n)
    {
        if (n < 10) {
            return n;
        }
        else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }


    public static long fibRecursion(long n) {

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }


    public static boolean palindrome(String str) {

        str = str.toLowerCase();

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        else if (str.length() == 1) {
            return true;
        }
        else {
            return palindrome(str.substring(1, str.length() - 1));
        }
    }

}


class HomeworkRecursionMain {
    public static void main(String[] args) {

        double n = 8192;
        String answer = isPowerOfTwo(n);
        System.out.println(answer);


        int num = 8192;
        int sum = sumOfDigits(num);
        System.out.println(sum);


        long fib = fibRecursion(20);
        System.out.println(fib);


        String str = "Tenet";
        System.out.println(palindrome(str));

    }

}
