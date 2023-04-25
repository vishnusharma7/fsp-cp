
import java.util.*;

public class hashone {
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
class sol {
    boolean subarray(int[] a, int n) {
        int sum=0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sum +=a[i];

            if (a[i]==0 || sum==0 || hs.contains(sum)) {
          
                return true;
            }
            hs.add(sum);          
        }
        return false;

    }

}