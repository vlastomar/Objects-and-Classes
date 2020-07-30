import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger firstNumb = new BigInteger(scan.nextLine());
        BigInteger secondNumb = new BigInteger(scan.nextLine());

        BigInteger sum = firstNumb.add(secondNumb);
        System.out.println(sum);
    }
}
