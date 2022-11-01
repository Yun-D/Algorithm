import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a * b / gcd(a,b));
			//최대공약수 g, 최소공배수 l=g*a*b
		}
		
	}
	
	//최대공약수를 유클리드 호제법으로 구하는 방법
	//유클리드 호제법 : 2개의 자연수가 서로 상대방 수를 나누어 최대공약수를 구하는 알고리즘.
	//a를 b로 나눈 나머지가 c일 때, a와 b의 최대 공약수 = b와 c의 최대 공약수
	static int gcd (int a, int b) {
		while (b > 0) {
			int temp = a;
			a = b;
			b = temp % b; //나누어 떨어질 때까지 나머지를 구한다.
		}
		
		return a;
	}
}