import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int repeat = Integer.parseInt(st.nextToken()); //반복할 횟수
			String s = st.nextToken(); //문자열
			
			for (int j=0; j<s.length(); j++) { //s의 길이만큼 반복
				for(int k=0; k<repeat; k++)
					System.out.print(s.charAt(j)); //인덱스의 문자를 반복 횟수만큼 반복
			}
			System.out.println(); //줄바꿈
		}
	}
}