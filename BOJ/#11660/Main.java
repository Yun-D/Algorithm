import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //표의 크기
		int m = Integer.parseInt(st.nextToken()); //합을 구해야 하는 횟수
		
		/// 원본 배열 받아서 합배열 만들기
		int[][] arr = new int[n+1][n+1]; //원본 배열
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] s = new int [n+1][n+1]; //합배열 구하기
		for (int j = 1; j < n+1; j++) {
			for (int i = 1; i < n+1; i++) {
				s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + arr[i][j]; 
			}
		}
		
		/// 합배열 이용하여 구간합 출력
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(s[x2][y2] - s[x2][y1-1] - s[x1-1][y2] + s[x1-1][y1-1]);
		}
	}
}