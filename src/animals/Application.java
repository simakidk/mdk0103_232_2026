package animals;

public class Application {
    public static void main(String[] args) {
        // создаём обхекты котов
        Cat murzik = new Cat("Мурзик", 5.2, 7);
        Cat unkown = new Cat(3.6);
        Cat murka = new Cat("Мурка", 7.8);

        System.out.println(murzik.weight());
        murzik.walk();
        murka.eat();
        murzik.piss();
        unkown.eat();
        unkown.SetName("Иосиф");
        unkown.piss();
        System.out.println(murzik.weight());

        Dog random = new Dog(10.0);
        Dog zevs = new Dog("Зевс", 7);

        zevs.eat();
        zevs.walk();
        random.piss();
        System.out.println(zevs.weight());

        Pig unnamed = new Pig("пеппа", 40, "обычная");
        unnamed.say();
        unnamed.walk();
        System.out.println(unnamed.weight());
        System.out.println("hello");
    }
}
