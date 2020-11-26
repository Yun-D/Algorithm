import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int [9];
		int max = 0;
		int idx = 0;
		
		for (int i=0; i<9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			
			if(nums[i] > max) {
				max = nums[i]; //최댓값 저장
				idx = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
	}
}

