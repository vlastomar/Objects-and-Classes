import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //BigInteger number = new BigInteger(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));

        for (int i = 1; i <=number ; i++) {
            result = result.multiply(BigInteger.valueOf((Integer.parseInt(String.valueOf(i)))));
        }
        System.out.println(result);

    }
}
