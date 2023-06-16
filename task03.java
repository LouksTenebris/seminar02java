//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class task03 {
        public static boolean increasingNum(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }return true;
    }

    public static boolean increasingNum2(String str){
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            int number2 = Integer.parseInt(array[i+1]);
            if(number > number2){
                return false;
            }
        }return true;
    }
}
