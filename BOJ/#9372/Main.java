import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int	t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			for (int j=0; j<m; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
			}
			
			//최소 신장 트리(MST)를 이용하면, 
			//모든 정점을 최소한으로 방문하기 위해 '정점(국가 개수) - 1개'의 간선이 필요하다.
			System.out.println(n - 1);
		}
	}
}