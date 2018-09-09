import java.util.Scanner;

public class ETI06F1 {
/*
Przykład 1

Wejście:
10 10

Wyjście:
235.62

Przykład 2

Wejście:
1000 1500

Wyjście:
1374446.79
*/

    public static Scanner in = new Scanner(System.in);

    private static double calculate(double r, double d) {
        double pi = 3.141592654;
        double result;
        //x2 = r2 - (d/2)2
        double resultSqrt = Math.pow(r, 2) - Math.pow(d / 2, 2);
        result = Math.round(resultSqrt * pi * 100);
        result = result / 100;

        return (result);
    }

    public static void main(String[] args) throws Exception {

//        int tests = in.nextInt();
//        for (int i = 0; i < tests; ++i) {
        float r2 = 0;
        double r = in.nextDouble();
        double d = in.nextDouble();

        System.out.println(calculate(r, d));

    }
//    }


}
