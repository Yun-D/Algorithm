import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int moveCnt = 0; //최소 이동거리 값을 저장
		
		//입력...
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //이동 가능 범위
		int m = Integer.parseInt(st.nextToken()); //바구니의 크기
		int left = 1; //바구니의 가장 왼, 오른쪽 위치
		int right = m;

		int apple = Integer.parseInt(br.readLine()); //떨어지는 사과의 수
		int[] move_arr = new int[apple]; //사과가 떨어질 곳 배열
		for (int i=0; i<move_arr.length; i++) {
			move_arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		//계산 및 출력...
		for (int i=0; i<apple; i++) {
			right = left + m - 1; //사과를 받으러 움직이면 바구니의 위치도 바뀌게 됨!!!!!
			
			//1. 사과가 떨어질 좌표가 바구니 왼쪽 좌표보다 작을 경우
			if (move_arr[i] < left) {
				moveCnt += left - move_arr[i];
				left = move_arr[i]; //바구니 좌측으로 이동
			}
			//2. 바구니 오른쪽 좌표보다 클 경우
			else if (move_arr[i] > right) {
				moveCnt += move_arr[i] - right;
				left = move_arr[i] - right + left; //이동한 부분만큼 기존 좌표를 더해주어 바구니 왼쪽 좌표를 움직임
			}
			//3. 바구니를 움직이지 않고도 사과를 받아낼 수 있을 경우
			else {
				moveCnt += 0;
			}
		}
		
		
		System.out.println(moveCnt);
	}
}