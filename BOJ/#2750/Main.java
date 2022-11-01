import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		
		for (int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numbers);
		
		for (int i=0; i<n; i++) {
			System.out.println(numbers[i]);
		}
	}
}
