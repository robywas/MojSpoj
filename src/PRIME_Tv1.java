import java.util.Arrays;
import java.util.Scanner;

public class PRIME_Tv1 {

    public static Scanner in = new Scanner(System.in);
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for(int i=2; i*i<=number; ++i){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {

        int tests = in.nextInt();
        for (int x = 0; x < tests; ++x) {
            int number = in.nextInt();
            if (isPrime(number)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }
}