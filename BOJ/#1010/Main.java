import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int dp[][] = new int [n+1][m+1];
			
			//n이 m보다 큰 경우, 이을 수 없는 경우에는 다리가 이어지지 않음 
			for (int j=2; j<=n; j++)
				dp[j][1] = 0;
			
			//서쪽 사이트가 1일 경우, 동쪽 사이트의 수 만큼 다리를 이을 수 있음 
			for (int k=1; k<=m; k++)
				dp[1][k] = k;
			
			//dp[n][m] = dp[n][m-1] + dp[n-1]m-1]
			for (int x=2; x<=n; x++) {
				for (int y=2; y<=m; y++) {
					dp[x][y] = dp[x][y-1] + dp[x-1][y-1];
				}
			}
			
			System.out.println(dp[n][m]);
		}
		
	}
}