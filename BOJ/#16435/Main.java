import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//입력...
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //과일의 개수
		int l = Integer.parseInt(st.nextToken()); //스네이크버드 초기 길이 정수
		//length = l; //스네이크 버드의 최대 길이. 초기 값은 스버의 초기길이!
		int[] fruit = new int[n]; //과일 위치 받을 배열
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			fruit[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(fruit); //과일들 오름차순으로 정렬
		
		//출력...
		for (int i=0; i<fruit.length; i++) {
			if (l >= fruit[i])
				l++;
		}
		
		System.out.println(l);
	}
}