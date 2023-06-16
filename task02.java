// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Arrays;

public class task02 {
    public static void replaceOfNegativeNum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 9 & array[i] < 100){
                sum = sum + i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = sum;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
