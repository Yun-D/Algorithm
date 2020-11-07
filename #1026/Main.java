import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st, stt;
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
				
		st = new StringTokenizer(br.readLine());
		stt = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(stt.nextToken());
		}
		
		//문제에서는 b배열은 정렬하지 말라고 했지만 결국 출력하는 것은 최소 계산 값 s
		//b배열의 큰 수 * a배열의 작은 수는 동일
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		//계산 및 출력
		int s = 0;
		for (int i=0; i<n; i++) {
			s += a[i] * b[n-1-i];
		}
		System.out.println(s);
	}
}