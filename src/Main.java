import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{3, 6, 4, 7, 2, 1, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Index of the number " + number + " is " + i);
            }
        }

        //Реализовать алгоритм, который будет находить сумму квадратов всех элементов массива!
        int[] secondArray = new int[]{3, 6, 4, 7, 2, 1, 9};
        System.out.println(Arrays.toString(secondArray));
        int sum = 0;
        for (int j : secondArray) {
            sum += j * j;
        }
        System.out.println("Sum of squares = " + sum);
    }
}
