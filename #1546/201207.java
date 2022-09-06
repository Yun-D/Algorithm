import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] testScore = new double[N]; //시험 점수 저장할 배열
		
		double M = 0; //최댓값
		double sum = 0; //합 저장할 변수
		
		//입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			testScore[i] = Integer.parseInt(st.nextToken());
			
			if(M < testScore[i])
				M = testScore[i];
		}
		
		//계산
		for (int i=0; i<N; i++) {
			testScore[i] = testScore[i] / M * 100; //기존 배열의 자리에 새로 계산한 값을 넣는다.
			sum += testScore[i];
		}
		
		System.out.println(sum / N); //새로운 평균 출력
	}
}