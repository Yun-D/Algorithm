import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		int l4 = 0;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			//l번째(12번째), 4열에 미치지 못하면 -1
			if (n < 12 || m < 4)
				l4 = -1;
			else {
				l4 = 11 * m + 4;
			}
			
			System.out.println(l4);
		}
		
	}
}