import java.util.Random;
import java.util.Scanner;

public class GtN {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Угадай число от 0 до 10");
        Random random = new Random();
        int num = random.nextInt(10);
        int x = in.nextInt();
        while (x != num) {
            if ( x < num) {
                System.out.println("Случайное число больше вашего");
                x = in.nextInt();
            }
            else if (x > num) {
                System.out.println("Случайное число меньше вашего");
                x = in.nextInt();
            }
        }
        System.out.println("Вы угадали!\n" +
                "Случайное число было: " + x);

    }
}
