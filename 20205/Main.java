import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] nums_old = new int [n][n];
		int[][] nums_new = new int [n*k][n*k];
		
		//입력 받기
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				nums_old[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//k배 처리
//		int oldI=0, oldJ=0;
//		int cnt=0;
//		for (int i=0; i<n*k; i++) {
//			//for (int j=0; j<n; j++) {
//				for (int j=0; j<n*k; j++) {
//					if (oldI == i && oldJ == j && cnt==1) {
//						oldI = 0;
//						oldJ = 0;
//					} else {
//						nums_new[i][j] = nums_old[oldI][oldJ];
//						cnt = 1;
//					}
//			}
//		}
		//이게 뭐지........ 
		
		//출력
		for (int i=0; i<n*k; i++) {
			for (int j=0; j<n*k; j++)
				System.out.print(nums_new[i][j] + " ");
			System.out.println();
		}
	}
}