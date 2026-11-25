import java.util.Random;

public class LessonMethod2 {

    public static void main(String[] args) {
     int[] grades1 = {5,7,4,89,33,22,60}; // 7 элементов
     int[] grades2 = new int[10]; // 10 элементов
     int[] grades3 = {44,67,98,44,42,55,59,52,69}; // 9 элементов
             // заполение массива
        Random random = new Random();
     for (int i = 0; i < grades2.length; i++) {
         grades2[i] = random.nextInt(101);
     }
        printArray(grades1); // вызов метода printArray с аргументом массива grades
        printArray(grades2);
        printArray(grades3);
        sumArray(grades2);
    }
    public static void printArray(int[] array) {
        //вывод массива
        for (int i = 0; i<array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            // sum = sum + array[i]; полная запись
            sum+= array[i];
        }
        System.out.println(sum);
    }
}
