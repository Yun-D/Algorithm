import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st;
		
		String word = br.readLine().toUpperCase();
		int max = 0;
		char answer = ' ';
		int[] cnt_arr = new int [26];

		String[] word_arr = word.split("");
		Arrays.sort(word_arr); //오름차순으로 정렬
		
		for (int j=0; j<word_arr.length; j++) {
			int temp = 0;	
			temp = (int) word.charAt(j); //char -> ascii
			
			for (int k=65; k<=90; k++) {
				if (temp == k)  //일치하는 알파벳이 있다면 
					cnt_arr[temp - 65] += 1; //해당 알파벳 위치에 카운트 올려
			}
		}
		
		//가장 높은 빈도의 알파벳 알아내기
		for (int i=0; i<26; i++) {
			if (cnt_arr[i] > max) {
				answer = (char) (i + 65);
				max = cnt_arr[i];
			} else if (cnt_arr[i] == max) //2개 이상이면 ? 출력
				answer = '?';
		}
		
		System.out.println(answer);
	}
}