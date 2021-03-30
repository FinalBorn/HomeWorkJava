import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int y = Integer.parseInt(in.nextLine());
        System.out.println("Введите второе число число");
        int x = Integer.parseInt(in.nextLine());
        System.out.println("Введите текст");
        String str = in.nextLine();
        int lenghtStr = str.length();

        if (lenghtStr > x - 1) {
            System.out.println("Ошибка");
            return;
        }
        for (int yy = 0; yy < y; yy++) {
            for (int xx = 0; xx < x; xx++) {
                if (yy == 0 || yy == y - 1) {
                    System.out.print("*");
                }
                else if (xx == 0 || xx == x - 1) {
                    System.out.print("*");
                }
                else if (xx == ( Math.ceil( (double) x / 2) - Math.ceil((double) lenghtStr / 2))) {
                    if (y % 2 != 0 && yy == y / 2) {
                        System.out.print(str);
                        xx = xx + lenghtStr - 1;
                    }
                    else if (y % 2 == 0 && yy + 1 == y / 2) {
                        System.out.print(str);
                        xx = xx + lenghtStr - 1;
                    }
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }


    }
}
