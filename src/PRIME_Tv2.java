import java.util.Arrays;
import java.util.Scanner;

public class PRIME_Tv2 {
    public static Scanner in = new Scanner(System.in);
    public static boolean[] myPrimes = new boolean[100000];

    private static void createPrimesArr() {
        Arrays.fill(myPrimes, true);
        myPrimes[0] = false;
        myPrimes[1] = false;
        for (int i = 0; i <= Math.sqrt(myPrimes.length); i++) {
            if (myPrimes[i]) {
                for (int j = i + i; j <= Math.sqrt(100001); j = j + i)
                    myPrimes[j] = false;
            }
        }
        myPrimes[2] = false;
    }

    public static boolean isPrimary(int num){
        if(num<2){
            return false;
        }

        for(int i=2; i*i<=num; ++i){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main (String[] args) {

        createPrimesArr();
        int tests = in.nextInt();
        for (int x = 0; x < tests; ++x) {
            int number = in.nextInt();
            if (myPrimes[number]) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }

    }
}
