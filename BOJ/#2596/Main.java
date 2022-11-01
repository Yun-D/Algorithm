import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alphaList = {"000000","001111","010011","011100","100110","101001","110101","111010"};
		
		int n = Integer.parseInt(br.readLine());
		String original = br.readLine(); 
		ArrayList<String> list = new ArrayList<String>();
		
		String result = "";
		int result_i = 0;
		int wrongCnt = 0; //틀린 개수
		
		for (int i=0; i<n; i++) {
			list.add(original.substring(6 * i, 6*i + 6)); //6글자 문자만큼 나누어 list에 저장
		}
		
		boolean isPerfect = false;
		for (int i=0; i<n; i++) {
			isPerfect = false;
			
			//한 자씩 비교
			for (int j=0; j<8; j++) {
				wrongCnt = 0;
				
				for (int k=0; k<6; k++) {
					if (alphaList[j].charAt(k) != list.get(i).charAt(k)) {
						wrongCnt++; //암호가 틀린 게 있다면 개수++
					}				
				}
				
				if (wrongCnt < 2) { //틀린 개수가 1개 이하라면 문자 계산하여 result에 저장
					result += (char) (j + 'A');
					isPerfect = true; //문자로 완벽 출력!
					break;
				}
			}
			
			if (!isPerfect) { //문자로 표기할 수 없는 문자가 있었다면
				result_i = result.length() + 1; //표기하지 못 한 문자 자리 출력
				break;
			}
		}
		
		if (result_i != 0)
			System.out.println(result_i);
		else
			System.out.println(result);
	}
}
