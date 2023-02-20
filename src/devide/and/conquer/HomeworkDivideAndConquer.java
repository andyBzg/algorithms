package devide.and.conquer;

import java.util.Arrays;

import static devide.and.conquer.HomeworkDivideAndConquer.sortChars;


/*Расставьте в алфавитном порядке буквы.
Разрешается использование техники Разделяй и властвуй.
Полученные данные напечатайте.*/


public class HomeworkDivideAndConquer {
    public static String sortChars(String string) {

        string = string.toUpperCase();
        char[] chars = string.toCharArray();
        Arrays.sort(chars);

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }

}


class HomeworkMain {
    public static void main(String[] args) {

        String string = "poiuytrewqlkjhgfdsamnbvcxz";
        String result = sortChars(string);
        System.out.println(result);

    }

}