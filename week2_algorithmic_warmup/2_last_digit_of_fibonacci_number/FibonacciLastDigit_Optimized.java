import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciLastDigit_Optimized {
    private static Integer getFibonacciLastDigitNaive(int n) {

        List<Integer> F = new ArrayList<>();
        F.add(Integer.valueOf(0));
        F.add(Integer.valueOf(1));

        for (int i = 2; i <= n; i++) {
            Integer a = F.get(i - 1) % 10;
            Integer b = F.get(i - 2) % 10;
            F.add(i, (a+b) % 10);
        }
        return F.get(n);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

