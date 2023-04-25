
import java.util.*;
import java.util.Scanner;

class fpp {

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
        int n;
        System.out.print("Enter range:");
        n = sc.nextInt();
        sol ob = new sol();
        
		System.out.println(ob.countFriendsPairing(n));
	}
}
class sol{
    
	 int countFriendsPairing(int n){
		int dp[] = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i <= 2)
				dp[i] = i;
			else

				dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
		}

		return dp[n];
	}
}

