import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer (br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		for (int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		//계산
		int current = 0;
		int result = 0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				for (int k= j+1; k<n; k++) {
					
					current = card[i] + card[j] + card[k];
					
					if(current <= m)
						result = Math.max(current, result);
				}
			}
		}
		
		System.out.println(result);
	}
}
