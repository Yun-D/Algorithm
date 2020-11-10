import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트 케이스 개수, 컴퓨터 번호 number
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			st = new StringTokenizer(br.readLine());
			
			//테스트 케이스 정수 a, b
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int number = 1;
			
			for(int j=0; j<b; j++) 
				number = (number * a) % 10;
			
			if (number == 0)
				number = 10;
			
			System.out.println(number);
		}
	}
}
