import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st;
		int cnt = 1;

		// st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String seat = br.readLine();
		
		String[] s_arr = seat.split("");
		for (int i=0; i<n; i++) {
			if (s_arr[i].equals("S"))
				cnt++;
			
//				if (s_arr[i].equals("L") && s_arr[i+1].equals("L"))
//					cnt += 1;
			else {
				i++;
				cnt++;
			}
		}
		
		if (cnt > n)
			cnt = n;
		
		System.out.println(cnt);
	}
}