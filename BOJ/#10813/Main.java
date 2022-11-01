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
		int[] basket = new int[n+1];
		
		for(int i=1; i<=n; i++)
			basket[i] = i;
		
		for(int num=0; num<m; num++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int temp = 0;
			
			temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for(int i=1; i<=n; i++)
			System.out.print(basket[i] + " ");
	}
}