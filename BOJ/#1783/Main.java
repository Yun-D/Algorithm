import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로 길이
		int m = Integer.parseInt(st.nextToken()); // 가로 길이
		
		/* 조건::
		 * 1. 방문 칸이 5개 미만일 경우 이동방법에 제약이 없음.
		 * 2. 만약 5개 이상이면 모든 이동 방법을 1번씩은 사용해야 함.
		 * 3. 세로 n, 가로 m -> n은 상하로 이동 가능해야 하며, 오른쪽으로 나아갈 수 있을 m 크기가 보장되어야 함
		 * 
		 * 계산::
		 * 1. n이 1일 때는 아무데도 이동할 수 없으니, 처음 있었던 칸 1개를 반환
		 * 2. n이 2일 때는 조건1, 2를 충족하는 최댓값은 4가 됨. 
		 * 3. m이 7일 때 모든 이동 방법을 사용하며, 이 이후부터는 '2칸 위/아래 + 1칸 오른쪽' 방법으로 오른쪽은 1칸씩 소비가 가능하다.
		 * 4. m이 7미만일 경우는, 계산2와 같이 최댓값은 4
		 */
		
		int result = 0;
		
		if(n == 1) 
			result = 1;
		else if(n == 2) 
			result = Math.min(4, (m + 1) / 2);
		else if(m < 7)
        	result = Math.min(4, m);
		else //이동 방법 4가지 다 쓴 이후!
			result = m-2;
		
		System.out.println(result);
		
	}
}
