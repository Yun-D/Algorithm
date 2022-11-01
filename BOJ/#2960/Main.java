import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] numbers = new int[1001];
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//2부터 n까지 모든 정수를 적는다.
		for (int i=2; i<=n; i++) 
			numbers[i] = i;
		
		int cnt = 0;
		//p를 지우고, 아직 지우지 않은 p의 배수를 순서대로 지움
		for (int i=2; i<=n; i++) {
			for (int j=i; j<=n; j+=i) {
				if (numbers[j] == 0)
					continue; //이미 지워진 수는 건너뜀
				
				numbers[j] = 0;
				cnt++;
				
				if(cnt == k) { //k번째 지워진 수를 출력하고 프로그램 끝
					System.out.println(j);
					break;
				}
			}
		}
		
		
	}
}