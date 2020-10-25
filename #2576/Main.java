import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = 100;
		int sum = 0;
		boolean isthere = false;
		
		for (int i=0; i<7; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num % 2 == 1) {
				isthere = true;
				sum += num;
				min = Math.min(min, num);
			}
		}
		
		if (!isthere)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}