import java.io.*;
import java.util.*;


public class Main {	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int equalNum = 0;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<String> dataList = new ArrayList<>(); //기준 데이터 집합
		
		for (int i=0; i<N; i++) {
			dataList.add(br.readLine());
		}
		
		for (int i=0; i<M; i++) {
			if(dataList.contains(br.readLine()))
				equalNum++;
		}
		
		System.out.println(equalNum);
	}
}
