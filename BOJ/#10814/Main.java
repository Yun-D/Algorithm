
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder[] arr = new StringBuilder[201]; //나이만큼의 스트링빌더

		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i< arr.length; i++) {
			arr[i] = new StringBuilder(); //나이 자리마다 하나하나 스트링빌더 공간을 만들어주기
		}
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			arr[age].append(age).append(' ').append(name).append('\n'); //arr의 해당 age 자리에 나이, 이름을 추가
		}
		
		//arr에는 위치값만 들어있으므로 새로운 sb를 만들어서 안에 들어있는 값들을 빼서 이어줌
		StringBuilder sb = new StringBuilder();
		for (StringBuilder value : arr) {
			sb.append(value);
		}
		
		System.out.println(sb);
	}

}