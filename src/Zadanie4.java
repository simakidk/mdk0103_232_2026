import java.util.Date;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] rashod = new double[7];
        boolean zapusk = true;

        while (zapusk) {
            System.out.println();
            System.out.println("МЕНЮ");
            System.out.println("1-Ввод расходов за день");
            System.out.println("2-Показать итог и конвертировать");
            int punkt = scan.nextInt();

            if (punkt == 1) {
                System.out.println("Введите день недели");
                int day = scan.nextInt();
                if (day >=1 && day<=7){
                    System.out.println("Введите расход за день");
                    double count = scan.nextDouble();
                    rashod[day - 1] = rashod[day - 1] + count;
                    System.out.println("Расход записан");

                    System.out.println("Введите день недели");
                    int day1 = scan.nextInt();
                    if (day1 >=1 && day1<=7) {
                        System.out.println("Введите расход за день");
                        double count1 = scan.nextDouble();
                        rashod[day1 - 1] = rashod[day1 - 1] + count1;
                        System.out.println("Расход записан");

                        System.out.println("Введите день недели");
                        int day2 = scan.nextInt();
                        if (day2 >=1 && day2<=7) {
                            System.out.println("Введите расход за день");
                            double count2 = scan.nextDouble();
                            rashod[day2 - 1] = rashod[day2 - 1] + count2;
                            System.out.println("Расход записан");

                            System.out.println("Введите день недели");
                            int day3 = scan.nextInt();
                            if (day3 >=1 && day3<=7) {
                                System.out.println("Введите расход за день");
                                double count3 = scan.nextDouble();
                                rashod[day3 - 1] = rashod[day3 - 1] + count3;
                                System.out.println("Расход записан");

                                System.out.println("Введите день недели");
                                int day5 = scan.nextInt();
                                if (day5 >=1 && day5<=7) {
                                    System.out.println("Введите расход за день");
                                    double count5 = scan.nextDouble();
                                    rashod[day5 - 1] = rashod[day5 - 1] + count5;
                                    System.out.println("Расход записан");

                                    System.out.println("Введите день недели");
                                    int day6 = scan.nextInt();
                                    if (day6 >=1 && day6<=7) {
                                        System.out.println("Введите расход за день");
                                        double count6 = scan.nextDouble();
                                        rashod[day6 - 1] = rashod[day6 - 1] + count6;
                                        System.out.println("Расход записан");
                                        System.out.println("Введите день недели");
                                        int day7 = scan.nextInt();
                                        if (day7 >=1 && day7<=7) {
                                            System.out.println("Введите расход за день");
                                            double count7 = scan.nextDouble();
                                            rashod[day7 - 1] = rashod[day7 - 1] + count7;
                                            System.out.println("Расход записан");

                                        }}}}}}} else  {
                    System.out.println("В неделе 7 дней!");
                }
            } else if (punkt == 2) {
                double Week = 0;
                for (int i = 0; i<rashod.length; i++) {
                    Week = Week +rashod[i];
                }
                System.out.println("Сумма за неделю:" + Week + "руб.");

                double USDT = 100;
                double EUR = 90;

                System.out.println("В долларах:" + Week/USDT);
                System.out.println("В Евро:" + Week/EUR);
            zapusk = false;
            } else {
            System.out.println("Неверный пункт");
        }
        }
    }
}
