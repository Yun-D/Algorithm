import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int current = 65; //화살표의 첫 위치는 A(65)
		int cnt = 0; //걸린 시간
		
		for (int i=0; i<str.length(); i++) {
			int x = Math.abs(current - str.charAt(i)); //현재 위치의 알파벳 - 다음 위치의 알파벳
			int y = Math.abs(26 - x); //반대 방향으로 돌릴 경우
			
			cnt += Math.min(x, y); //x, y중 최솟값(움직일 거리의 최솟값)을 cnt에 더해줌
			current = str.charAt(i);
		}
		
		System.out.println(cnt);
	}

}