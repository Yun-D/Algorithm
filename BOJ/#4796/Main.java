import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 1;
		int result = 0;

		while (true) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			if (l == 0 && p==0 && v==0)
				break;
			
			result = v%p > l ? (v/p*l) + l : (v/p*l) + (v%p); //v%p가 l보다 크다면 l을 더해줘야 함
			
			System.out.println("Case " + cnt + ": " + result);
			cnt++;
		}
	}
}