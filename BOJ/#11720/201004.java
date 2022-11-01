import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//숫자의 개수 n, 입력받은 숫자 numbers
		int n = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		
		String[] array_n = numbers.split(""); //String을 하나하나 떼어 배열로
		int sum=0;
		
		for(int i=0; i<numbers.length(); i++) {
			sum += Integer.parseInt(array_n[i]);
		}
		
		System.out.println(sum);
	}
}