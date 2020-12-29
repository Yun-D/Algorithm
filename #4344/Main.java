import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine());
		int sum = 0; //평균을 구하기 위해 점수 합을 모을 변수
		int greatStudent = 0; //평균을 넘는 점수를 얻은 학생 수 
		
		for (int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			sum = 0; 
			greatStudent = 0;
			
			int student = Integer.parseInt(st.nextToken()); //학생 수
			
			//입력
			int[] score = new int[student]; //학생 수 길이의 score배열 생성
			for (int j=0; j<student; j++) {
				score[j] = Integer.parseInt(st.nextToken()); //점수 넣기
				sum += score[j];
			}
			
			
			//계산			
			for(int j=0; j<student; j++) {
				if ((sum / student) < score[j])
					greatStudent++; //평균 넘는 학생 수 저장
			}
			
			
			//출력
			double ratio = ((double) greatStudent / (double) student) * 100; //비율 계산. 왜 꼭 double이라고 써줘야 되는 거지..??
			System.out.println(String.format("%.3f", (ratio * 1000) / 1000.0) + "%"); //소수점 셋째 자리까지 반올림
		}
	}
}
