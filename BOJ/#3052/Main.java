import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> remainder = new ArrayList<Integer> ();
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			int n = Integer.parseInt(br.readLine());
			
			remainder.add(n%42);
		}
		
		HashSet<Integer> remainder2 = new HashSet<Integer>(remainder); //hash로 중복 제
		//ArrayList<Integer> remainder3 = new ArrayList<Integer>(remainder2);
		
		for (int i=0; i<remainder2.size(); i++) {
			cnt++;
		}
		
		System.out.print(cnt);
	}
}

