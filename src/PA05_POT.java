import java.util.Scanner;

public class PA05_POT {

/*
    0 - 0,0,0,0
    1 - 1,1,1,1
    2 - 2,4,8,6
    3 - 3,9,7,1
    4 - 4,6,4,6
    5 - 5,5,5,5
    6 - 6,6,6,6
    7 - 7,9,3,1
    8 - 8,4,2,6
    9 - 9,1,9,1
*/


    public static Scanner in = new Scanner(System.in);

    public static int[][] t = new int[][]{
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {6, 2, 4, 8},
            {1, 3, 9, 7},
            {6, 4, 6, 4},
            {5, 5, 5, 5},
            {6, 6, 6, 6},
            {1, 7, 9, 3},
            {6, 8, 4, 2},
            {1, 9, 1, 9}
    };


    public static void main(String[] args) throws Exception {


        long tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();

            int a1 = a % 10;
            int b1 = b % 4;

            System.out.println(t[a1][b1]);

        }
    }
}
