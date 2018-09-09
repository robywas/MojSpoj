import java.util.Scanner;

public class BFN1 {
/*

    Wejście:
            3
            28
            68
            5

    Wyjście:
            121 2
            1111 3
            5 0
*/

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {
            int number = in.nextInt();
            int count = 0;
            String s = String.valueOf(number);
            while (!s.equals(new StringBuilder(s).reverse().toString())){
                count++;
                number = Integer.valueOf(s) + Integer.valueOf(new StringBuilder(s).reverse().toString());
                s = String.valueOf(number);
            }
            System.out.println(number +" "+count);
        }
    }
}
