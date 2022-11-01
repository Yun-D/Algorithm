import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int newN = 0;
		int cycle = 1;
		
		while(n != newN) {
			int n_10 = 0;
			int n_1 =0;
			int newN_10=0;
			
			if (newN == 0) {
				newN_10 = (n%10) * 10;
				n_10 = n / 10; //10의 자리
				n_1 = n % 10; //1의 자리
			} else {
				newN_10 = (newN%10) * 10;
				n_10 = newN / 10; //10의 자리
				n_1 = newN % 10; //1의 자리
			}
			
			int temp = n_10 + n_1;
			newN = newN_10 + (temp % 10);
			
			if(n == newN) {
				break;
			} else
				cycle++;
		}
		
		System.out.println(cycle);
	}
}