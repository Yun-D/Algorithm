import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int move = a - b; //하루동안 이동할 수 있는 거리
		int result = (v-b) / move;
		
		//만약 달팽이가 도달한 result에 나머지가 남았다면 (갈 길이 남았다면)
		if ((v-b) % move != 0)
			result++;
		
		System.out.println(result);
	}
}