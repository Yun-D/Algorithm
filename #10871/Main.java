import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		int[] result = new int[n];
		
		int cnt=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			
			if(nums[i] < x) {
				result[cnt] = nums[i];
				cnt++;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			if(result[i] > 0)
				System.out.print(result[i] + " ");
			
			else
				break;
			
		}
	}
}