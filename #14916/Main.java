import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력...
		int change = Integer.parseInt(br.readLine());
		int result = 0; // 동전 수

		while (change > 0) {
			if (change % 5 == 0) { 
				result += change / 5;
				break;
			}

			change -= 2; // 5로 안나눠지면 2원을 줄 거야
			result++;
		}

		if (change < 0)
			System.out.println("-1"); // 거스름돈이 0보다 적어지면 -1
		else
			System.out.println(result);
	}
}