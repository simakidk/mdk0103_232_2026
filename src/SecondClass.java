import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        /*условный оператор: if-else
        если условие истино, то
              выполнить комманду1;
          иначе
             выполнить команду2;
         */

        /*основные операторы сравнения
        > - больше
        < - меньше
        >= - больше равно
        <= - меньше равно
        == - равно (2знака - сравнение) (1знак - присвоение)
        != - не равно


     ввод с консоли
         */
//        System.out.println("введите ваш возраст");
        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//
//      if (age<18) {
//          System.out.println("доступ закрыт");
//      } else {
//          System.out.println("добро пожаловать");
//      }



        // работа со строками в условиях
        /*
        сравнение с == в Java работает корректно для чисел.
        дробные числа сравнивать через == нежелательно.
        для строрк используем метод equals().
        который сравнивает содержимое строк (а не ссылки).
         */


        String password = "12345";
        System.out.println("введите пароль: ");
        String userPassword = input.nextLine();
        if (password.equals(userPassword)) {
            //вызываем метод equals() и передаём в него другую строку.
            System.out.println("пароль верный");
        } else {
            System.out.println("пароль неверный");
        }


        // вложенные if, многоуровневная логика
        // проход в клуб



        System.out.println("введите имя");
        String name = input.nextLine();

        System.out.println("ваш возраст");
        int ageUser = input.nextInt();
        input.nextLine();
        if (ageUser >= 21) {
            System.out.println("введите пригласительный код");
            String codeUser = input.nextLine();
                    if(codeUser.equals("QWER")) {
                System.out.println("добро пожаловать," + name + "в VIP-клуб");
            } else {
                        System.out.println("неверный код, доступ запрещён!");
                    }
        } else {
            System.out.println("Извините, вход только с 21 года");
        }





    }
}
