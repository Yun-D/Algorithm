import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String word = br.readLine();
		String[] cambridge = {"C", "A", "M", "B", "R", "I", "D", "G", "E"}; //캠브릿지 철자를 미리 등록해두고
		String[] word_arr = word.split("");
		
		for (int i=0; i<word.length(); i++) {
			//ArrayList의 contains()를 쓰기 위해 cambridge배열을 ArrayList로 만들어준 것~!
			if (Arrays.asList(cambridge).contains(word_arr[i])) { //cambridge에 word_arr[i]가 있다면
				continue; //넘어가
			} else //없으면
				System.out.print(word_arr[i]); //출력해
		}
	}
}
