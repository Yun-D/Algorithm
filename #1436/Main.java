import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int num = 665;
		
		int chk=0;
		while (chk != n) {
			num ++;
			String temp = String.valueOf(num);
			
			if (temp.contains("666")) //문자열화 한 temp에 666이 포함되어있다면 
				chk++;
		}
		
		System.out.println(num);
	}
}