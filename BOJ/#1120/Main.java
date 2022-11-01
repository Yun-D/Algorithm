import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String A = st.nextToken();
		String B = st.nextToken();
		
		int diff = B.length() - A.length(); //두 문자열의 길이 차이
		int cnt = 0;
		int answer = B.length(); //만약 아무리 알파벳을 추가해도 같아지지 않는다면 두 문자열간 차이는 없다.
		
		for (int i=0; i<=diff; i++) { //A의 시작 위치
			cnt = 0;
			
			for (int j=0; j<A.length(); j++) {
				if (B.charAt(j+i) != A.charAt(j)) //A의 자리를 옮겨가며 B와 차이 개수 저장
					cnt++;
			}
			
			if (answer > cnt)
				answer = cnt;
		}
		
		System.out.println(answer);
	}
}