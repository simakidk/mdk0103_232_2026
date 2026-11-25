import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] rashod = new int[7];



        for (int i = 0; i < rashod.length; i++) {
            rashod[i] = random.nextInt(4501) + 500;
        }


        int sum = 0;
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};


        for (int i = 0; i < rashod.length; i++) {
            System.out.println(days[i] + ": " + rashod[i] + " руб.");
            sum += rashod[i];
        }


        System.out.println("");
        System.out.println("Сумма трат за неделю: " + sum + " руб.");
    }
}