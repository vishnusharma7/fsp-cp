
import java.util.*;
public class reducedis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sol ob = new sol();
       System.out.println(ob.maxSatisfaction(a)); 

    }
}
class sol{
   int maxSatisfaction(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        int res=0,total=0;
        int n = a.length;
        for (int i = n-1; i>=0 && a[i]> -total; --i) {
            total +=a[i];
            res +=total;
        }
        return res;

    }
}
