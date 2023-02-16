package recursion;

import java.util.Scanner;

import static recursion.HomeworkRecursion.recursion;

public class HomeworkRecursion {

    public static int recursion(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n < 1) {
            return 0;
        }
        else {
            return recursion(n / 2);
        }
    }

}
class HomeworkRecursionMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        if (recursion(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
