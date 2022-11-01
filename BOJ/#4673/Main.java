import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		boolean[] isSelfNum = new boolean[10001]; 
		Arrays.fill(isSelfNum, true);
		
		for (int i=1; i<10001; i++) {
			int idx = d(i); //d(n)의 리턴값을 인덱스로 가져오는 것임
			
			if (idx < 10001)
				isSelfNum[idx] = false; //셀프넘버가 아님!!
		}
		
		for (int i=1; i<10001; i++ ) {
			if (isSelfNum[i])
				System.out.println(i);
		}
	}
	
	//셀프넘버 판별용 함수
	//셀프넘버 == 생성자가 없는 수.
	public static int d(int n) {
		int sum = n;
		
		while (n != 0) {
			sum += n % 10; //1의 자리
			n = n / 10; //자리수대로 없애줌....
		}
		return sum;
	}
	
	
}