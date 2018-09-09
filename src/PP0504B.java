import java.util.Scanner;

public class PP0504B {
/*
Input:
4
a bb
abs sfd
ewr w
wqeqweqweq eqweqwe

Output:
ab
asbfsd
ew
weqqewqewqewqe
*/

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {

            String s1 = in.next();
            String s2 = in.next();
            String result="";
            int size = Math.min(s1.length(), s2.length());
            for (int j = 0; j < size; j++)
                result += s1.charAt(j) + "" + s2.charAt(j);
                System.out.println(result);
        }

    }
}
