import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 0의 자리로 끝나려면 10으로 나누어 0이 되어야 한다. 
		// 10은 2, 5로 구성되어 있으므로, n!을 소인수분해해 2, 5를 얼마나 가지고 있는지를 더해나간다.
		while (n >= 5) {
			cnt += n / 5;
			n /= 5;
		}
		
		System.out.println(cnt);
	}
}
