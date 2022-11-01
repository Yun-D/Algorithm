import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] plaNum = new int[10]; //사용된 플라스틱 숫자 위치를 확인하기 위한 불린 배열
		Arrays.fill(plaNum, 0); //사용하지 않았다는 의미로 모두 0으로 채워줌

		// 입력...
		int n = Integer.parseInt(br.readLine());
		
		//stream -> intStream으로 변환해 n을 자릿수별로 나누어 배열로 만들어주~
		int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		
		
		for (int i=0; i<digits.length; i++) {
			
			//6 <-> 9 로 사용 가능
			if (digits[i] == 6 || digits[i] == 9) {
				plaNum[6] ++;
				
			} else {
				plaNum[ digits[i] ] ++;
			}
		}
		
		plaNum[6] = (int) Math.ceil( (double) plaNum[6] / 2); //6에 들어간 6,9 사용횟수를 반으로 나눈 뒤 올림처리
		
		Arrays.sort(plaNum);
		System.out.println(plaNum[plaNum.length - 1]); //최대값 출력
	}
}