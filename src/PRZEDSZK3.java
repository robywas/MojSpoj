import java.util.Arrays;
import java.util.Scanner;

public class PRZEDSZK3 {

    public static Scanner in = new Scanner(System.in);


//Algorym Euklidesa

//    nww a*b/nwd(a, b)
//    nwd

private static int nww(int a, int b){
    return a*b/nwd(a, b);
}
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

            System.out.println(nww(a,b));

        }
    }

}
