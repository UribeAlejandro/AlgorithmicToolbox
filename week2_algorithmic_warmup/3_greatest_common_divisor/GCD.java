import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {

    int r = a % b;
    int current_gcd = b;

    if (a > b && r ==0){
      return current_gcd;
    } else {
      return gcd(b, a%b);
    }

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }
}
