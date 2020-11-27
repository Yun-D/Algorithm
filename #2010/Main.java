import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int computer = 0;
		
		for (int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			
			if (i == n-1) {
				computer += nums[i];
			} else
				computer += nums[i] - 1;
		}
		
		System.out.println(computer);
	}
}