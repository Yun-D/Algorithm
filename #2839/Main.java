import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		int temp = 0;
		while (n > 0) {
			if (n % 5 == 0) {  
				n -= 5;
				cnt++;
			} else if (n % 3 == 0) { 
				n -= 3;
				cnt++;
			} else if (n > 5) { //5로 떨어지진 않지만 5이상일 경우 
				n -= 5;
				cnt++;
			} else {
				cnt = -1;
				break;
			}
			
		}
		
		System.out.println(cnt);
	}
}