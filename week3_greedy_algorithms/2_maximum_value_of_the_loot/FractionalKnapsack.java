import java.util.*;

public class FractionalKnapsack {
    private static double getOptimalValue(int n, int capacity, int[] values, int[] weights) {
        double value = 0;
        List<Double> unit_prices = new ArrayList<Double>(n);

        for (int i= 0; i< n; i++) {
            unit_prices.add((double) values[i] / weights[i]);
        }

        Collections.sort(unit_prices, Collections.reverseOrder());

        for (double unit_price: unit_prices) {

            value += unit_price;
        }



        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(n, capacity, values, weights));
    }
} 
