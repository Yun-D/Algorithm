import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) { //1일 경우 둘레는 4
			System.out.println(4);
		} else {
			long[] arr = new long[n+1]; //n+1로 만들어 한 면의 길이를 쉽게 구하게끔 함
			Arrays.fill(arr, 1); //idx 0, 1은 모두 1로 같으므로 일단 초기화 해둠
			
			// [1, 1, 2, 3, 5, 8, 13, 21 ....] 순으로 사이즈 커짐
			for (int i=0; i<=n-2; i++) { //arr의 i+2를 미리 구하므로 i는 n-2까지만 커지게 조건 걸었음
				arr[i+2] = arr[i] + arr[i+1]; //{1, 1, 1, ... } 이었던 배열을 17라인 주석처럼 바꿔주기 위해 계산
			}
			
			//둘레 구하기
			System.out.println( (2 * arr[n]) + (2 * arr[n-1]) ); //가로세로 면 구한 것으로 둘레 구함
		}
	}
}