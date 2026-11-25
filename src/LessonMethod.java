// Методы

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

/*
Класс { - НАЧАЛО КЛАССА
  метод MAIN {
    точка входа в программу (главный метод программы)
  }
  метод1()
  метод2()
  метод3()
} - КОНЕЦ КЛАССА
 */
public class LessonMethod {
    public static void main(String[] args) throws InterruptedException {
        String name = "Vasya";
        System.out.println("Привет" + name);

        sayHello("Muha");

        String name1 = "Vanya";
        System.out.println("Привет" + name1);

        String name2 = "Petya";
        System.out.println("Привет" + name2);
        // вызов метода
        sayHello();
        sayHello();
        sayHello();
        sayByTime();
        showDateNow();
        downLoad();

        String  passGen = passGenerator(5);
        System.out.println(passGen);

        System.out.println(passGenerator(5));
    }  // конец метода Main

    public static void  sayHello() {
        // public static void - служебные слова
        // sayHello() - имя метода, всегда с ()
        System.out.println("Привет!!!");
    }

    public static void sayHello(String name) {
        System.out.println("Привет" + name);
    }

    public static void sayBye(String name) {
        System.out.println("Пока" + name);
    }

    public static void sayByTime() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    public static void showDateNow() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getDayOfWeek());
    }

    public static void downLoad() throws InterruptedException {
        System.out.print("....0%");
        for (int i =5; i <= 100; i+=5) {
            Thread.sleep(100);
            System.out.print("\r,,," + i + "%");
        }
        System.out.print("\rЗагрузка завершена");
    }

    // Методы которые возвращают значения
    private static String passGenerator(int count) {
        char[] arr = {'a','4','f','B','!','S','5'};
                // StringBuilder предназначен для создания
                // и модификации изменённых символов.
        StringBuilder string = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; 1 < count; i++) {
            string.append(arr[rand.nextInt(arr.length)]);
        }
        return  string.toString();
    }

} // конец класса LessonMethod
