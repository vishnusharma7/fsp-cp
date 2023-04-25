
import java.io.*;
import java.util.*;

public class magicalcow {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


  static final int MAX_DAYS = 50;

  public static void main(String[] args) throws IOException {
    String[] line = br.readLine().split(" ");

    final int C = Integer.parseInt(line[0]);

    final int N = Integer.parseInt(line[1]);

    final int M = Integer.parseInt(line[2]);

    long[][] dp = new long[MAX_DAYS + 1][C + 1];

    for (int i = 0; i < N; i++) {
      int cows = Integer.parseInt(br.readLine());
      dp[0][cows]++;
    }

    for (int day = 0; day < MAX_DAYS; day++) {
      for (int i = 1; i <= C; i++) {
        if (i <= C / 2) {
          dp[day + 1][i * 2] += dp[day][i];
        } else {
          dp[day + 1][i] += 2 * dp[day][i];
        }
      }
    }

    for (int i = 0; i < M; i++) {
      int day = Integer.parseInt(br.readLine());
      System.out.println(query(dp, day));
    }
  }

  private static long query(long[][] dp, int day) {
    long farms = 0;
    long[] frequencies = dp[day];
    for (int i = 0; i < frequencies.length; i++) {
      farms += frequencies[i];
    }
    return farms;
  }
}