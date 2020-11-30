import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1); //등장하지 않는 문자를 위해 미리 -1로 초기화
		
		for (int i=0; i<s.length(); i++) { //입력받은 s의 길이만큼
			for (int j=0; j<26; j++) { //알파벳 전체를 돌면서 알파벳 배열에 저장
				if ( s.charAt(i) - 97 == j) { //일치하는 알파벳을 찾았다면
					if (alphabet[j] != -1) //알파벳 배열에 저장된 적 있다면 넘어가
						continue;
					else //아니라면 등장위치 저장!
						alphabet[j] = i;
				} 
			}
		}
		
		for (int i=0; i<alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
	}
}