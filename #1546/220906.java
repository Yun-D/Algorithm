import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int m = 0; //최댓값
		for (int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			m = Math.max(m, temp);
			sum += temp;
		}
		
		double answer = sum * 100.0 / m / n;
		System.out.println(answer);
	}
}