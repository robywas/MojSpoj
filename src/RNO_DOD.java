import java.util.Scanner;

public class RNO_DOD {

/*
    2
    5
    1 2 3 4 5
    2
    -100 100

    */

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {
            int num = 0;
            int numberOfNumbers = in.nextInt();
            for (int j = 0; j < numberOfNumbers; j++)
                num += in.nextInt();
            System.out.println(num);
        }
    }
}
