import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력...
		String inputLine = br.readLine();
		String result = "";
		char[] realUCPC = {'U', 'C', 'P', 'C'}; //비교를 위해 미리 UCPC를 넣어둠.
		
		//대문자인 문자 추출
		for (int i=0; i<inputLine.length(); i++) {
			if (Character.isUpperCase(inputLine.charAt(i))) { //만약 입력문자가 대문자라면 result에 추가
				char temp = inputLine.charAt(i);
				result += Character.toString(temp);
			} else
				continue;
		}
		
		int idx = 0;
		boolean isUCPC = false;
		
		for (int j=0; j<result.length(); j++) {
			if (result.charAt(j) == realUCPC[idx]) //모든 문자를 돌면서 U,C,P,C가 있는지 확인
				idx++;
			
			if (idx == 4) {
				isUCPC = true;
				break;
			}
		}
		
		if (isUCPC)
			System.out.println("I love UCPC");
		else
			System.out.println("I hate UCPC");
	}
}