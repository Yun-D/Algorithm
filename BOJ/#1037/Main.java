import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //진짜 약수의 개수
		int[] realNums = new int[n];
		
		for(int i=0; i<n; i++)
			realNums[i] = sc.nextInt(); //진짜 약수 받아서 배열에 넣기..
		
		//배열에 담긴 진짜 약수 중 최소값, 최대값을 곱하면 약수!
		Arrays.sort(realNums);
		System.out.println(realNums[0] * realNums[n-1]);
	}
}
