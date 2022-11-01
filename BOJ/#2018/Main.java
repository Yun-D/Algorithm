import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 1; //1부터 시작해 자연수의 합 임시 저장
		int count = 1; //자기 자신을 하나 가져감
		//투 포인터
		int start_idx = 1;
		int end_idx = 1;
		
		while(end_idx < N) {
			if (sum > N) {
				sum = sum - start_idx; 
				start_idx++;
			}
			else if (sum < N) {
				end_idx++;
				sum = sum + end_idx;
			}
			else if (sum == N) {
				end_idx++;
				sum = sum + end_idx;
				count++;
			}
		}
		
		System.out.println(count);
	}
}