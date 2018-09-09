import java.util.Arrays;
import java.util.Scanner;

public class PP0501A {

/*

    Input:
            5
            1 4
            4 1
            12 48
            48 100
            123456 653421

    Output:
            1
            1
            12
            4
            3
*/


//Algorym Euklidesa

//    nww a*b/nwd(a, b)
//    nwd
public static Scanner in = new Scanner(System.in);

private static int nwd(int a, int b) {
        int c = Math.max(a,b) - Math.min(a,b);
        while (a != 0) {
            int t[] = {a, b, c};
            Arrays.sort(t);
            a = t[0];
            b = t[1];
            c = t[1] - t[0];
        }
        return b;
    }


    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {

            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(nwd(a,b));

        }
    }

}
