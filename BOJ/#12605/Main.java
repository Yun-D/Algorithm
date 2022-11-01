import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 1; //순서를 출력하기 위해 추가
		
		Stack<String> stack = new Stack<>(); //문자열형 스택 선언
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			//스택에 쌓기
			while (st.hasMoreElements()) //st에 토큰이 있는 동안 반복
				stack.push(st.nextToken()); //스택에 토큰을 하나씩 추가
			
			//출력하기
			System.out.print("Case #" + cnt + ": "); //case 출력 형식 맞추기
			
			while (!(stack.empty())) { //스택이 비어있지 않을 동안 반복
				System.out.print(stack.peek() + " "); //스택의 가장 상단의 값을 출력
				stack.pop();
			}
			
			cnt++; //순서 변수 ++
			System.out.println(); //개행을 위해 추가
		}
	}
}
