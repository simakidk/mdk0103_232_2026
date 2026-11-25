import java.util.Random;
import java.util.Scanner;

public class EstinateService {
/*
Пользователю предлагают оценить работу
приложения по шкале от 1 до 5.
Для каждой оценки предусмотрен свой вариант оответа
После того как пользователь ввел, программа
печатает соответствующий ответ,
если введены другие цифры - вопрос будет повторятся
 */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("оцените работу приложения от 1 до 5");
    int userInput;

    while (true) {
        userInput = scanner.nextInt();
        if ((userInput == 1 || userInput == 2)) {
            System.out.println("Нам очень жаль");
            break;
        } else if (userInput == 3) {
            System.out.println("Мы будем улучшаться");
            break;
        }
        else if (userInput == 4) {
            System.out.println("Спасибо есть куда расти");
            break;
        }
        else if (userInput == 5) {
            System.out.println("Спасибо за доверие");
        }
        else {
            System.out.println("должно быть в диапазоне от 1 до 5");
        }
    }
    

}

}
