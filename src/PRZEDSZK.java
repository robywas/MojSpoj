import java.util.Scanner;

public class PRZEDSZK {

    public static Scanner in = new Scanner(System.in);
    private static int estimate(int bigerNumber, int smallerNumber) {

        int number = bigerNumber;
        while (number%smallerNumber != 0)
            number += bigerNumber;

        return number;
    }


    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {

            int a = in.nextInt();
            int b = in.nextInt();

            if (a>b)
                System.out.println(estimate(a,b));
            else
                System.out.println(estimate(a,b));


        }
    }

}
