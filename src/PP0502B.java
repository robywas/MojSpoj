import java.util.Scanner;

public class PP0502B {
/*
Wejście:
2
7 1 2 3 4 5 6 7
3 3 2 11

Wyjście:
7 6 5 4 3 2 1
11 2 3
*/

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {
            StringBuilder sb = new StringBuilder();
            int size = in.nextInt();
            int numbers[] = new int[size];
            for (int j = 0; j < size; j++)
                numbers[j]=in.nextInt();
            for (int j = size-1; j>=0; j-- )
                System.out.print(numbers[j]+" ");
            System.out.println();
        }

    }
}
