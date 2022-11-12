import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] aeiou = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			ArrayList<String> result = new ArrayList<>();
			
			for (int j=0; j<input.length(); j++) {
				String current = String.valueOf(input.charAt(j));
				
				if (Arrays.asList(aeiou).contains(current)) {
					result.add(current);
				}
			}
			
			if (result.size() > 0) {
				for (int j = 0; j < result.size(); j++) {
					System.out.print(result.get(j));
				}
			} else {
				System.out.println("???");
			}
			System.out.println();
		}
	}
}