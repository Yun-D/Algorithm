import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String octal = br.readLine();
		String[] octalToBinary = {"000", "001", "010", "011", "100", "101", "110", "111"}; //0~7을 2진수로 변환한 것
		
		for (int i=0; i<octal.length(); i++) {
			int target = octal.charAt(i) - '0'; //char to int
			
			if (i == 0 && target < 4) {
				if (target == 0) { //octal이 0일 경우
					System.out.println(0);
					break;
				} else if (target == 1) {
					sb.append("1");
				} else if (target == 2) {
					sb.append("10");
				} else if (target == 3) {
					sb.append("11");
				}
			} else {
				sb.append(octalToBinary[target]);
			}
			
		}
		
		System.out.println(sb.toString());
	}
}
