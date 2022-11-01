import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		List<Integer> x_arr = new ArrayList<Integer> (); //가로 칸
		List<Integer> y_arr = new ArrayList<Integer> (); //세로 칸		
		
		//입력...
		st = new StringTokenizer(br.readLine());
		x_arr.add(0);
		y_arr.add(0);
		x_arr.add(Integer.parseInt(st.nextToken())); //가로 마지막 칸 (가로 사이즈)
		y_arr.add(Integer.parseInt(st.nextToken())); //세로!
		
		int n = Integer.parseInt(br.readLine()); //자를 횟수
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken()); //0 / 1. 가로로 자를 것인지 세로로 자를 것인지
			int line = Integer.parseInt(st.nextToken()); //몇번째 줄을 자를 것인지
			
			if (type == 0)
				y_arr.add(line);
			else
				x_arr.add(line);
		}
		
		//출력...
		Collections.sort(x_arr); //어레이리스트들 오름차순으로 정렬!
		Collections.sort(y_arr);
		
		int width = 0;
		int height = 0;
		int maxSize = 0; //가장 큰 조각 넓이
		for (int i=1; i<x_arr.size(); i++) {
			for (int j=1; j<y_arr.size(); j++) {
				
				width = x_arr.get(i) - x_arr.get(i - 1);
				height = y_arr.get(j) - y_arr.get(j - 1);
				maxSize = Math.max(maxSize, width * height); //가장 큰 조각 넓이 구하기!!
			}
		}
		
		System.out.println(maxSize);
	}
}