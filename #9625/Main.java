
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 1; //어찌되었든 1번은 꼭 변함! 미리 b++
		
		//개수 계산하기...
		for (int i=1; i<k; i++) {
			int temp = a + b; //규칙성을 봤을때, 버튼을 누를 수록 a는 b, b는 a+b만큼 늘어나게 됨
			
			a = b;
			b = temp;
		}
		
		System.out.println(a + " " + b);
	}

}