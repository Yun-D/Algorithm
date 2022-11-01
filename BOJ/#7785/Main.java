import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		HashSet <String> log = new HashSet<> ();
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if (state.equals("enter"))
				log.add(name);
			else if (state.equals("leave")) {
				log.remove(name); //set은 순서가 중요하지 않음. set에서 get은 없고, remove(값)으로 처리함
			}
		}
		
		ArrayList <String> log2 = new ArrayList<>(log);
		Collections.sort(log2, Collections.reverseOrder()); //역순 정렬
		
		for (int i=0; i<log2.size(); i++)
			System.out.println(log2.get(i));
	}
}