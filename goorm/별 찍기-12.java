import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=input; i++) {
			for (int j=0; j<input-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for (int i=1; i<input; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<input-i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}