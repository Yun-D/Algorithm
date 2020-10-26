import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = 0;
		int temp = 0;
		int[] num = new int[10];
		
		for (int i=0; i<10; i++) 
			num[i] = Integer.parseInt(br.readLine());
		
		//score = num[0];
		for (int i=0; i<10; i++) {
			temp = score + num[i];
		
			if (score < temp && temp<100) {
				score += num[i];
			} else if (temp >= 100){
				break;
			}
		}
		
		if (temp - 100 > 100 - score) ////100과 가까운 두 수 중에는 더 큰 쪽을 넣어!
			System.out.println(score);
		else
			System.out.println(temp);
	}
}