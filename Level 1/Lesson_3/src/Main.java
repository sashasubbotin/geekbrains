import java.util.Random;
import java.util.Scanner;

// Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args [ ] ) {

        for ( ; ; ){
            System.out.println("Будете играть? ВВедите 1, если согласны или 0, если нет");
            play();
        }
    }
    public static void play(){
        int a = scanner.nextInt();
        if ( a ==1) {
            System.out.println("У вас 3 попытки");
            System.out.println("Введите число от 0 до 9");
            Random rand = new Random();
            int random_number = rand.nextInt(10);
            for (int i  = 2; i >= 0; i--) {
                Scanner sc = new Scanner(System.in);
                int number = scanner.nextInt();
                if (random_number == number) {
                    System.out.println("Вы угадали число!");
                    return;
                } else {
                    if (random_number > number) {
                        System.out.println("Загаданное число больше");
                        System.out.println("Осталось " + i + " попыток");
                    } else {
                        System.out.println("Загаданное число меньше");
                        System.out.println("Осталось " + i + " попыток");
                    }
                }
            }
        }else {
            return;
        }
    }
}