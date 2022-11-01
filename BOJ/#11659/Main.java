import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] sum_arr = new int [n+1]; //미리 생성할 합배열
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			sum_arr[i] = sum_arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for (int k=0; k<m; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(sum_arr[j] - sum_arr[i-1]);
		}
	}
}