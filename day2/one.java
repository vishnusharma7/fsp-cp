
import java.util.*;

public class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sol ob = new sol();
        System.out.println(ob.subarray(a, n));

    }
}

/**
 * Innerone
 */
class sol {
    boolean subarray(int[] a, int n) {
        int cursum;
        for (int i = 0; i < n; i++) {
            cursum = 0;
            for (int j = i; j < n; j++) {
                cursum += a[j];
                if (cursum == 0) {
                    return true;
                }
            }

        }
        return false;

    }

}