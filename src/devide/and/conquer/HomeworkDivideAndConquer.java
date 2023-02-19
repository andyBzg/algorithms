package devide.and.conquer;

import java.util.Arrays;

import static devide.and.conquer.HomeworkDivideAndConquer.sortChars;

public class HomeworkDivideAndConquer {
    public static String sortChars(String string) {

        string = string.toUpperCase();
        char[] chars = string.toCharArray();
        Arrays.sort(chars);

        string = "";
        for (char c : chars) {
            string += c;
        }

        return string;
    }

}


class HomeworkMain {
    public static void main(String[] args) {

        String string = "poiuytrewqlkjhgfdsamnbvcxz";
        String result = sortChars(string);
        System.out.println(result);

    }

}