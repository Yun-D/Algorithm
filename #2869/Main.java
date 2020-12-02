import java.io.*;
import java.util.*;

//실패!!!!!!!!
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int move = a - b; //하루동안 이동할 수 있는 거리
		int result = 0;
		
		if ( v == a )  //하루만에 도달 가능하다면
			result = 1;
		else {
			if (v % move != 0 || v-move < a) //막대 길이 % 이동 거리가 나누어 떨어지지 않을 경우
				result = (v-b) / move + 1;
			else //나누어 떨어진다면
				result = (v-b) / move; //달팽이가 도달하는 날은 미끄러지지 않음!!!
		}
		
		System.out.println(result);
	}
}