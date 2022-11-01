import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			String ox = br.readLine();
			String[] ox_s = ox.split("");
			int score = 0;
			int temp=0;
			
			for(int j=0; j<ox_s.length; j++) {
				if (ox_s[j].equals("O")) 
					temp++;
				else {
					temp = 0;
				}
				
				score += temp;
			}
			
			System.out.println(score);
		}
	}
}