import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		int idx = Integer.parseInt(br.readLine());
		
		for (int i=0; i<idx; i++) {
			st = new StringTokenizer(br.readLine());
			String n = st.nextToken(); // 원본
			String m = st.nextToken(); // 바꿀 이진수

			int diff = 0; //원본과 이진수 사이 다른 부분의 개수
			int cnt = 0; //최종 정답
			
			int temp_n=0, temp_m=0;
			for (int j=0; j<n.length(); j++) {
				if (n.charAt(j) != m.charAt(j))
					diff++;
				if (n.charAt(j) == '1') //첫번째 if 결과값을 검증하기 위해 n, m의 1의 개수를 받음
					temp_n++;
				if (m.charAt(j) == '1')
					temp_m++;
			}
			
			
			if (temp_n == temp_m) //1의 개수가 같아 다른 부분 비트를 서로 바꿔줌
				cnt = diff / 2;
			else { //1의 개수가 다를 경우, 차이 나는 만큼 연산 방법 1을 시켜줘야 함. 
				int temp = Math.abs(temp_n - temp_m);
				cnt = (((diff - temp) / 2) + temp);
			//        이동 횟수 구하기 (방법 1),  비트 변환시켜 줄 횟수
			}
		
		
			System.out.println(cnt);
		}
	}
}
