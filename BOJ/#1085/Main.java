import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y, w, h;
		int minValue=0;
		
		//입력
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		//계산
		minValue = Math.min(Math.min((h-y), y), Math.min(x, (w-x)));
		
		System.out.println(minValue);
	}

}
