import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num =  Integer.parseInt(br.readLine());
		int numLength = (int)(Math.log10(num)+1);
		int[] numArray = new int[10]; //0~9 자리가 들어갈 배열
		Arrays.fill(numArray, 0); //0으로 초기화
		
		for(int i=0; i<numLength; i++) {
			int current = num % 10;
			num /= 10;
			
			numArray[current]++; //현재 값의 자리에 값++
		}
		
		
		for (int i=9; i>=0; i--) { //내림차순으로 보여줘야 하므로 9부터 시작
			if(numArray[i] != 0) {
				for(int j=0; j<numArray[i]; j++) //들어있는 값만큼 반복하여 해당 자릿수 출력
					System.out.print(i);
			}
		}
	}
}
