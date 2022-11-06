import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split("");
		
		int r_1 = 0;
		int r_I = 0;
		int r_l = 0;
		int r_ai = 0;
		
		for (int i=0; i<arr.length; i++) {
			String temp = arr[i];
			if (temp.compareTo("1") == 0) {
				r_1 ++;
			} else if (temp.compareTo("I") == 0) {
				r_I ++;
			} else if (temp.compareTo("l") == 0) {
				r_l ++;
			} else if (temp.compareTo("|") == 0) {
				r_ai ++;
			} 
		}
		System.out.println(r_1);
		System.out.println(r_I);
		System.out.println(r_l);
		System.out.println(r_ai);
	}
}