import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
			
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int[] temp = new int [p+1];
		int tempp = n;
		int idx = 0;
		boolean isFound = false;
		
		while (!isFound) {
			tempp = n * tempp % p; //먼저 한 번 나머지 계산하고 
			
			for (int i=0; i<idx; i++) { //추가된 배열 요소 중 첫 요소와 같을 경우 중단 (반복이 시작되면)
				if (temp[i] == tempp) {
					isFound = true;
					System.out.println(idx-i);
					break;
				}
			}
			
			temp[idx] = tempp;
			idx++;
		}
		
	}
}