import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		int l = Integer.parseInt(br.readLine()); // 롤케이크 길이
		int n = Integer.parseInt(br.readLine()); // 방청객 수
		int[] cake = new int[l]; //롤케이크 배열
		Arrays.fill(cake, 0);
		
		int greedy = 0; //가장 많은 케이크 조각을 받을 것으로 기대한 방청객 번호
		int[] winner_arr = new int[n]; //케이크를 가장 많이 받은 방청객 번호를 구할 배열
		int wish = 0; //기대치를 구하기 위한 임시 변수
		
		//계산...
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			//롤케이크 배분하기
			for (int j=p; j<=k; j++) {
				if (cake[j-1] > i || cake[j-1] == 0) {//케이크 배열에 이미 방청객 번호가 들어가 있을 경우를 제외하고 번호삽입
					cake[j-1] = i + 1; //방청객 번호 집어넣기
					winner_arr[i]++;
				} else
					continue;
			}
			
			//그리디 구하기
			if (wish < k-p + 1) { //가장 많은 조각이 여러 명일 경우 방청객 번호가 작은 사람 우선
				wish = k-p + 1; //각각 원하는 케이크 조각 수를 임시변수에 미리 넣어둠
				greedy = i + 1;
				
			} else
				continue;
		}
		
		int max = 0;
		int winner = 0;
		for (int x=1; x<=n; x++) {
			if (max < winner_arr[x-1]) {
				max = winner_arr[x-1];
				winner = x;
			}
		}
		
		System.out.println(greedy);
		System.out.println(winner);
	}
}
