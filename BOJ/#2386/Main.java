import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		//테스트 케이스 여러 개. #을 입력 받을 경우 중지
		while(true) {
			String letter = sc.next().toLowerCase();
			
			if (letter.equals("#"))
				break;
			
			else {
				String sentence = sc.nextLine().toLowerCase();
				String[] array_s = sentence.split("");
				
				for (int i=0; i<sentence.length(); i++) {
					if (array_s[i].equals(letter))
						sum += 1;
				}
				
				System.out.println(letter + " " + sum);
			}
			
			sum = 0;
		}
		
	}
}
