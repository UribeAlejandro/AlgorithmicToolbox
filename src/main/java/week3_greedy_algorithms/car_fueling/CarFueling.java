package week3_greedy_algorithms.car_fueling;

import java.util.*;
import java.util.stream.IntStream;

public class CarFueling {
    private static int farthestGasStation(int distTraveled, int tank, int[] stops) {
        int bestGasStation = -1;

        for (int i = 0; i < stops.length; i++) {
            if (distTraveled + tank >= stops[i]) {
                bestGasStation = i;
            }
        }
        return bestGasStation;
    }

    private static int[] getSliceOfArray(int[] arr, int startIndex, int endIndex) {
        int[] slice = IntStream.range(startIndex, endIndex).map(i -> arr[i]).toArray();

        return slice;
    }

    private static int computeMinRefills(int dist, int tank, int[] stops) {
        int nRefills = 0;
        int distTraveled = 0;
        int n = stops.length;
        int currentRefill = 0;

        if (dist < tank) {
            return 0;
        } else {
            while (currentRefill < n) {
                distTraveled = currentRefill;
                while (currentRefill < n - 1 && stops[currentRefill + 1] - stops[distTraveled] <= tank) {
                    currentRefill++;
                }
                if (currentRefill == distTraveled) {
                    return -1;
                }
                if (currentRefill <= n) {
                    nRefills++;
                }
            }
        }
        if (distTraveled + tank < dist) {
            return -1;
        }

        return nRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
