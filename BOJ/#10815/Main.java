import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int numberCard[];
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		numberCard = new int[N]; //숫자 카드
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			numberCard[i] = Integer.parseInt(st.nextToken());
		}
		
		M = Integer.parseInt(br.readLine());
		int num[] = new int[M]; //정수들
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		

		/////////////////////////////////////// 게산 및 출력
		Arrays.sort(numberCard); //숫자카드 정렬
		
		for (int i=0; i<M; i++) {
			if(binarySearch(num[i]))
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
			
	}
	
	//이분탐색을 사용하여 타겟이 숫자카드 배열의 중간값보다 크면 
	public static boolean binarySearch(int target) {
		int start = 0; //첫번째 인덱스
		int end = N - 1; //마지막 인덱스
		int mid; //중간 인덱
		
		while(start <= end) {
			mid = (start + end) / 2;
			
			if (target > numberCard[mid])
				start = mid + 1;
			else if (target < numberCard[mid])
				end = mid - 1;
			else //target이 배열[mid]에 위치한 경우 1 출력
				return true;
		}
		
		return false;
	}
}
