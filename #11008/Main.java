import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			int cnt = 0; //걸린 시간
			
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken(); //문자열
			String p = st.nextToken(); //포함 문자열
			
//			while(s.contains(p)) { //s에 p가 존재할 동안
//				s = s.replaceFirst(p, ""); //s에 있던 p를 없애준 후(처음 발견한 부분만 치환하는 함수!!)
//				cnt++; //걸린 시간 1초 추가
//			}
//			
//			if (!s.isEmpty()) { //p를 모두 제거한 후에도 s에 문자가 남아있다면
//				cnt += s.length(); //남은 문자만큼 걸린 시간 추가
//			}
			
			if (s.contains(p))
				s = s.replaceAll(p, " ");
			cnt = s.length();
			
			System.out.println(cnt);
		}
	}
}
