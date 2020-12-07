import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A*B*C; //계산 결과 저장
		//String[] result_arr = String.valueOf(result).split(""); //result를 String화 하여 자릿수 별로 배열에 넣음
		int[] numList = new int [10]; //0~9 수들의 집합
		Arrays.fill(numList, 0); //0으로 초기화
		
		//몇 번 쓰였는지 확인
		//1번째 방법
//		for (int i=0; i<result_arr.length; i++) {
//			for (int j=0; j<=9; j++) {
//				if (Integer.parseInt(result_arr[i]) == j)
//					numList[j]++; //빈도++
//			}
//		}
		//2번째 방법
		while (result != 0) {
			numList[result % 10] += 1; //맨 끝자리를 추출한 것을 numList의 인덱스로
			result /= 10;
		}
		
		//출력
		for (int i=0; i<numList.length; i++) {
			System.out.println(numList[i]);
		}
	}
}