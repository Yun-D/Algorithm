import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(arr); //오름차순으로 정렬
		int counter = 0;
		
		for (int i = 0; i < N; i++) {
			int start = 0;
			int end = N-1;
			
			while (start < end) {
				if (arr[start] + arr[end] == arr[i] ) {
					if (start == i) { // 현재의 내 위치에 있는 경우
						start++;
					}
					else if (end == i) {
						end--;
					} else {
						counter++;
						break;
					}
				} 
					
				if (arr[start] + arr[end] < arr[i]) {
					start++;
				}
				else if (arr[start] + arr[end] > arr[i]) {
					end--;
				} 
			}
		}
		
		System.out.println(counter);
	}
}