import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] x = new int [n]; //몸무게
		int[] y = new int [n]; //키
		int[] compareSize = new int [n]; //덩치 비교를 위한 배열
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer (br.readLine());
			
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		//계산
		int currentX, currentY = 0;
		
		for (int i=0; i<n; i++) {
			int taller = 0; //덩치 등수를 구하기 위한 변수
			currentX = x[i];
			currentY = y[i];
			
			for (int j=0; j<n; j++) {
				if (i == j)
					continue;
				if (currentX < x[j]) {
					if (currentY < y[j])
						taller++;
				}
				
			}
			
			compareSize[i] = taller + 1;
		}
		
		for (int i : compareSize) {
			System.out.print(i + " ");
		}
	}
}
