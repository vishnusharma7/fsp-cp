
import java.util.*;

public class dp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no:");
        n = sc.nextInt();
        Innerdp ob = new Innerdp();
        System.out.println(ob.minStepToOne(n));
    
    }
}

class Innerdp {
    int minStepToOne(int n) {
        int r = 0;
        int[] memo = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            memo[i] = -1;
        }
        if (n == 0 || n == 1) {
            return 0;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        r = 1 + minStepToOne(n - 1);
        if (n % 2 == 0) {
            r = Math.min(r, 1 + minStepToOne(n / 2));

        }
        if (n % 3 == 0) {
            r = Math.min(r, 1 + minStepToOne(n / 3));

        }
        memo[n] = r;

        return r;
    }

}