import java.util.Arrays;

public class Main {

    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Барсик", 30), new Cat("Тимофей", 80), new Cat("Васька", 20), new Cat("Даша", 50)};
        Plate plate = new Plate( 100);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
