import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 가로, 세로 길이
		int k = Integer.parseInt(st.nextToken()); // 배수
		
		ArrayList<Integer> temp_list = new ArrayList<Integer>();
		for (int j=0; j<n; j++) {
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) 				
				temp_list.add(Integer.parseInt(st.nextToken()));
		}
		
		//계산...
		int idx = 0;
		for (int i=0; i<n; i++) { 
			ArrayList<Integer> result = new ArrayList<Integer>(); //결과물을 저장할 리스트
			
			for (int j=0; j<n; j++) {				
				for (int x=0; x<k; x++) {
					result.add(temp_list.get(idx));
				}
				idx++;
			}
			
			for (int y=0; y<k; y++) {
				for (Object temp : result)
					System.out.print(temp + " ");
				if (y != k-1)
					System.out.println();
			}
			System.out.println();
		}
		
	}
}
