package animals;
/*
-class SamClass
-name (переменные)
-конструктор
-сеттеры и геттеры
-методы
-переопределение методов (например toString)
 */
public class Cat {
    String name;
    double weight;
    int life;

    // 1-й конструктор
    public Cat(String name, double weight, int life){
        this.name = name;
        this.weight = weight;
        this.life = life;
    }

    // 2-й конструктор (имя и вес)
    public Cat(String name, double weight){
        this.name = name;
        this.weight = weight;
        this.life = 1;
    }

    // 3-й конструктор (вес)
    public Cat(double weight){
        this.name = "Неизвестный кот";
        this.weight = weight;
        this.life = 1;
    }
    // сеттеры - это методы которые устанавливают значение
    public void SetName(String name){
        this.name = name;
    }

    // геттеры - это методы которые получают значение
    public String name() {
        return name;
    }

    public double weight() {
        return weight;
    }

    public int life() {
        return life;
    }



    // методы (ходить, кушать, спать ... )
    public void walk() {
        System.out.println(this.name + " гуляет");
    }

    public void eat() {
        System.out.println(this.name + " кушает");
        this.weight = this.weight + 0.5;
    }

    public void piss(){
        System.out.println(this.name + " сходил в туалет");
        this.weight = this.weight + 0.3;
    }
}
