import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int jinwoo = Integer.parseInt(st.nextToken());
		int sunwoo = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine()); //알고싶은 날
		int thisDay = 1;
		
		for(int i=0; i<d; i++) {
			int tempJ = 0;
			int tempS = 0;
			if (thisDay % 2 == 1) { //오늘 날짜가 홀수일 경우
				tempJ = (int) Math.ceil( (double) jinwoo / 2 );
				jinwoo = jinwoo - tempJ;
				sunwoo = sunwoo + tempJ;
			} else {
				tempS = (int) Math.ceil( (double) sunwoo / 2 );
				sunwoo = sunwoo - tempS;
				jinwoo = jinwoo + tempS;
			}
			thisDay++;
		}
		
		System.out.println(jinwoo + " " + sunwoo);
	}
}