import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for (int i=1; i<=n; i++) {
			if (add(i) == n) {//i의 분해합과 n이 같을 경우
				answer = i; //n의 생성자는 i가 된다!
				break; //가장 작은 생성자를 구해야 하므로 찾았다면 break를 걸어줌
			}
		}
		
		System.out.println(answer);
	}
	
	//분해합을 구하는 메서드 생성
	public static int add (int n) {
		int result = n;
		while (n != 0) {
			result += n % 10;
			n = n / 10;
		}
		
		return result;
	}
}
