import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int cnt = 0;
		
		for (int i=0; i<word.length() - 1; i++) {
			char now = word.charAt(i);
			char next = word.charAt(i+1);
			
			if (now == 'c') {
				if (next == '=')
					cnt++;
				else if (next == '-')
					cnt++;
				else
					continue;
			} else if (now == 'd') {
				if (next == '-')
					cnt++;
				//else if (next == 'z' && word.charAt(i+2) == '=')
				else if(i<word.length()-2 && next == 'z' && word.charAt(i+2) == '=')
					cnt++;
				else
					continue;
			} else if (now == 'l') {
				if (next == 'j')
					cnt++;
				else
					continue;
			} else if (now == 'n') {
				if (next == 'j')
					cnt++;
				else
					continue;
			} else if (now == 's') {
				if (next == '=')
					cnt++;
				else
					continue;
			} else if (now == 'z') {
				if (next == '=')
					cnt++;
				else
					continue;
			}
		}
		
		cnt = (word.length() - cnt);
		System.out.println(cnt);
	}
}