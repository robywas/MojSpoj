import java.util.Scanner;

public class FCTRL3 {

    public static Scanner in = new Scanner(System.in);

    private static void printSolution(long number) {
        if (number <= 1) {
            System.out.println("0 1");
        } else if (number == 2) {
            System.out.println("0 2");
        } else if (number == 3) {
            System.out.println("0 6");
        } else if (number == 4) {
            System.out.println("2 4");
        } else if (number == 5 || number == 6 || number == 8) {
            System.out.println("2 0");
        } else if (number == 7) {
            System.out.println("4 0");
        } else if (number == 9) {
            System.out.println("8 0");
        } else {
            System.out.println("0 0");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {
            long number = in.nextInt();
            printSolution(number);
        }
    }
}
