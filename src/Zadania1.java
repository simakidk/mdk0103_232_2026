import java.util.Scanner;

public class Zadania1  {
    //вариант 13
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите рост в метрах");
        float h = scan.nextFloat();
        System.out.println("Напишите вес в кг");
        float m = scan.nextFloat();
        float I = m / (2*h);
    if (I<=16) {
        System.out.println("Выраженный дефицит массы тела");
    }
    if ((I<=18.5) && (I>16)){
        System.out.println("Дефицит массы тела");
    }
    if ((I>18.5) && (I<=25)){
        System.out.println("Норма");
    }
    if ((I>25) && (I<=30)){
        System.out.println("Избыточная масса тела(предожирение)");
    }
    if ((I>30) && (I<=35)){
        System.out.println("Ожирение 1 степени");
    }
    if ((I>35) && (I<40)){
        System.out.println("Ожирение 2 степени");
    }
    if (I>=40){
        System.out.println("Ожирение 3 степени");
    }
    
    }

}
