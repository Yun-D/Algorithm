import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			/* 두 원의 교접 부분을 구하는 경우의 수
			 * 1. 두 원이 완벽히 일치함 (원 반지름, 원점 모두 일치) = 무한. -1
			 * 2. 두 원이 교접하지 않음 (원이 원' 안에, 원 반지름 다름, 원점 일치) = 0
			 * 3.                  (원이 원' 안에, 원 반지름 다름, 원점 일치하지 않음) = 0 = 반지름의 차가 두 원 간의 중점 거리보다 클 때
			 * 4.                  (원, 원'이 만나지 않음) = 0 = 두 점 사이 거리가 각 원의 반지름 합보다 클 때
			 * 5. 서로 다른 원점에서 1개의 점을 교접함 = 1 = 내접할 경우(두 점 사이 거리=반지름의 차), 외접할 경우(두 점 사이 거리=반지름들의 합)
			 * 6. 두 원이 겹쳐 2개의 점을 교접함 = 2
			 * */
			
			//두 좌표 사이의 길이(distance) 구하기. pow : 거듭제곱 계산(대상숫자, 횟수)
			//sqrt : 제곱근 값 계산
			double distance = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
			
			if (x1==x2 && y1==y2 && r1==r2) //1
				cnt = -1;
			else if ((distance > r1+r2) || (distance < Math.abs(r2-r1)) || (x1==x2 && y1==y2 && r1!=r2)) //4, 3, 2
				cnt = 0;
			else if ((distance == Math.abs(r1-r2)) || (distance == r1+r2)) //5. 내접-외접 순
				cnt = 1;
			else //6
				cnt = 2;
			
			System.out.println(cnt);
		}
	}
}