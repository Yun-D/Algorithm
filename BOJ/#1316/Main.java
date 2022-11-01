import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			boolean alpha[] = new boolean[26]; //a~z 26개
			
			for (int j=1; j<word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) { //이전 알파벳과 같은 알파벳이 아니라면
					if(alpha[word.charAt(j-1) - 97] == true) { //현재 알파벳이 이전에 나온적이 있다면(true처리 되었다면)
						cnt++; //그룹 단어가 아님!
						break;
					}
					
					alpha[word.charAt(j-1) - 97] = true; //나온 알파벳은 true 처리
				}
			}
		}
		
		System.out.println(n-cnt);
	}
}