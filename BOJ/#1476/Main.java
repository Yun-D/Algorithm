import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken()); 
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//게산...
		int year = 1;
		
		while(true) {
			if ( (year-e) % 15 == 0 && (year-s) % 28 ==0 && (year-m) % 19 == 0) { //year-e,s만족하는 배수일 경우 스탑
			//if ( year % 15 == e && year % 28 == s && year % 19 == m) { // 나머지가 같을 경우 스탑.... 이 방법도 있었음.
				break;
			}
			
			year++;
		}
		
		System.out.println(year); //빼줬던 1을 다시더해주
	}
}




