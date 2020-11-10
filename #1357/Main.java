import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		System.out.print(Rev(Rev(x) + Rev(y)));
	}
	
	static int Rev(int num) {
		int result = 0;
		
		while (num > 0) {
			result *= 10;
			result += num % 10;
			num /= 10;
		}
		
		
		return result;
	}
}
