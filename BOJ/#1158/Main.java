import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		//사람 수 n, 제거될 ~번째 k
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) - 1;
		int idx = k; 
		
		LinkedList<Integer> q = new LinkedList<Integer> (); //큐 만들어
		sb.append("<");
		
		for (int i=1; i<=n; i++)
			q.add(i); //큐에 n까지의 숫자 넣기
		
		while(q.size() != 1) {
			sb.append(q.get(idx).toString() + ", "); //큐의 k번째 값을 가져와 sb에 넣어 
			q.remove(idx);
			idx = (idx + k) % q.size();
		}
		
		//출력하기
		sb.append(q.poll().toString() + ">"); //큐에 남은 숫자들도 sb에 넣고
		System.out.println(sb);
	}
}