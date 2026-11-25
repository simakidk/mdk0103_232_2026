import java.util.Random;
import java.util.Scanner;

public class ThirdClass {
    /*
    циклы - повторяющиеся действия
    while
    for
    do-while
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("Начало цикла while");
        int x = 0; // инициализация счётчика x
        while (x <= 100) { // while (логическое условие)
            // тело цикла
            System.out.println(x);
            x = x + 10; // x+=
        }
        System.out.println("Цикл завершён");
        // for () {тело цикла}
        System.out.println("Начало цикла FOR");
        for (int y = 0; y <= 100; y += 10) {
            System.out.println(y);

        }
        System.out.println("Цикл завершен for");

        for (int start = 10; start > 0; start--) {
            System.out.println("До старта осталось " + start + "секунд");

        }
        System.out.println("Пуск");


        int start1 = 10;
        while (start1 > 0) {
            System.out.println("До старта осталось" + start1 + "секунд");
            start1 = start1 - 1;

        }
        System.out.println("Пуск");

        /*
        Ракета летает в космосе, с космонавтом.
        чтобы ему вернуться на Землю, нужно ввести код от 0 до 10
        Но, код обновляется каждый раз, когда ракета
        сделала полный круг вокруг планеты.
        Когда пилот угадывает код, он возвращается на Землю.

         */
        int codeRocket;
        int codeUser;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            codeRocket = random.nextInt(10);
            System.out.println("Введите код:");
            codeUser = scanner.nextInt();
            if (codeRocket == codeUser) {
                System.out.println("Ура! Летим на Землю");
                break; // выход из цикла
            }

        }
        System.out.println("Мы приземлились!");



    }

}
