import java.sql.SQLOutput;
import  java.util.Scanner;

public class Kth {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        k++;

//        long  i = 0;
//        long t = 0;
//        long j;
//        long x = 0;
//        int y = 0;
//        k++;
//        while (i < k) {
//           t++;
//           j = t;
//           while (j > 0) {
//               j = j /10;
//               i++;
//           }
//        }
//        while ( i >= k ) {
//            x = t % 10;
//            t = t/10;
//            i--;
//        }
//        System.out.println(x);

        int d = 1;
        long p = 1;

        while (k > 9*d*p) {
            k -= 9*d*p;
            d += 1;
            p *= 10;
        }

        long n = p + (k-1)/d;
        long m = d - (k-1)%d - 1;

        while (m-- > 0)
            n /= 10;

        System.out.println(n % 10);
    }
}
