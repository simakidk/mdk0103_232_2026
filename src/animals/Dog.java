package animals;
/*
-class SamClass
-name (переменные)
-конструктор
-сеттеры и геттеры
-методы
-переопределение методов (например toString)
 */
public class Dog {
    String name;
    double weight;
    int life;

    // 1-й конструктор
    public Dog(String name, double weight, int life){
        this.name = name;
        this.weight = weight;
    }

    // 2-й конструктор (имя и вес)
    public Dog(String name, double weight){
        this.name = name;
        this.weight = weight;
        this.life = 1;
    }

    // 3-й конструктор (вес)
    public Dog(double weight){
        this.name = "Неизвестный пёс";
        this.weight = weight;
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
