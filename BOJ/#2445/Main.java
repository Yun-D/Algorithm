import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			for (int k=0; k<i; k++)
				System.out.print("*");
			
			for (int j=0; j<n*2-(i*2); j++)
				System.out.print(" ");
			
			
			for (int k=0; k<i; k++)
				System.out.print("*");
			
			
			System.out.println();
		}
		
		for (int i=n-1; i>=1; i--) {
			for (int j=0; j<i; j++)
				System.out.print("*");
			
			for (int k=0; k<n*2-(i*2); k++)
				System.out.print(" ");
			
			for (int j=0; j<i; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}