import java.util.Scanner;

public class FLAMASTE {


/*
    OPSS
    ABCDEF
    ABBCCCDDDDEEEEEFGGHIIJKKKL
    AAAAAAAAAABBBBBBBBBBBBBBBB
*/

    public static Scanner in = new Scanner(System.in);
    private static StringBuilder sb;
    private static char lastChar;
    private static int count;


    public static String modifyString(String string) {
        count = 0;
        sb = new StringBuilder();
        string = string + ' ';
        lastChar = string.charAt(0);
        sb.append(String.valueOf(lastChar));
        count++;
        for (int i = 1; i < string.length(); i++) {
            char c = string.charAt(i);

            if (!(c == lastChar)) {
                if (count > 1)
                    countRepeatedChars(c);
                addCharToStringBuilder(c);
            } else
                count++;
        }
        return sb.toString();
    }


    private static void countRepeatedChars(char c) {
        if (count == 2) {
            sb.append(lastChar);
        } else {
            sb.append(String.valueOf(count));
        }
    }

    private static void addCharToStringBuilder(char c) {
        count = 1;
        sb.append(c);
        lastChar = c;
    }


    public static void main(String[] args) throws Exception {


        int tests = in.nextInt();
        for (int i = 0; i < tests; ++i) {

            String s = in.next();
            s = modifyString(s);
            if (s.length() > 0)
                System.out.println(s);
        }
    }
}
