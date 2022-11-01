import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = 0;
		int max=0;
		
		for (int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			
			int outP = Integer.parseInt(st.nextToken());
			int inP = Integer.parseInt(st.nextToken());
			
			if (num != 0)
				num = num - outP + inP;
			else
				num = inP;
			
			if (num > max || max == 0)
				max = num;
			
		}
		
		System.out.println(max);
	}
}
