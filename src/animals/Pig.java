package animals;
/*
 имя, вес, порода
 действия - голос, ходит,
 */
public class Pig {
    String name;
    double weight;
    String poroda;

    public Pig(String name, double weight, String poroda){
        this.name = name;
        this.weight = weight;
        this.poroda = poroda;
    }

    // 2-й конструктор (имя и вес)
    public Pig(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    // 3-й конструктор (вес)
    public Pig(double weight){
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
    public String poroda() {
        return poroda;
    }
    // методы (ходить, кушать, спать ... )
    public void walk() {
        System.out.println(this.name + " гуляет");
    }


    public void say(){
        System.out.println(this.name + " хрюкает");
    }
}
