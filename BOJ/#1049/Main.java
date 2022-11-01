import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //끊어진 기타줄
		int m = Integer.parseInt(st.nextToken()); //브랜드 수
		int total = 0;
		
		int[] packagePrice = new int[m];
		int[] piecePrice = new int[m];
		
		//가격 정보 받기
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			packagePrice[i] = Integer.parseInt(st.nextToken());
			piecePrice[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(packagePrice);
		Arrays.sort(piecePrice);
		
		int tempN = n; //n값 임시 저장
		
		if (n >= 6) { //끊어진 수가 6개보다 많다면 패키지 사야함
			total = packagePrice[0] * (n / 6);
			n = n % 6;
		}
		
		total += piecePrice[0] * n;
		
		//예외처리
		if (total > (packagePrice[0] * ((tempN/6) + 1)))
			//만약 낱개 구매를 더하는 것 보다 패키지를 하나 더 사는 것이 이득일 경우 토탈 값 변경
			total = packagePrice[0] * ((tempN/6) + 1);
		else if (packagePrice[0] > piecePrice[0] * 6)
			//패키지 가격이 낱개 가격*6보다 비쌀 경우 낱개로 계산하는 게 이득
			total = piecePrice[0] * tempN;
		
		System.out.println(total);
	}
}