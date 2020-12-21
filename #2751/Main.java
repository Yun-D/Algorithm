import java.io.*;
import java.util.*;

public class Main {
	public static int[] numbers;
	public static int[] tmp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		numbers = new int[n];
		tmp = new int[numbers.length];
		
		for (int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(0, numbers.length-1);
		//Arrays.sort는 퀵정렬을 사용하지만,최악의 경우 O(n^2)의 시간 복잡도를 가지게 됨
		//병합 정렬의 시간복잡도는 O(nlogn)
		
		for (int i=0; i<n; i++) {
			bw.write(numbers[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	//병합 정렬
	public static void mergeSort(int start, int end) { 
		if (start<end) { 
			int mid = (start+end) / 2; //배열을 쪼개기 위해 가운데 인덱스 저장
			mergeSort(start, mid); //첫번째 분할
			mergeSort(mid+1, end);  //두번째 분할
			
			//두 분할의 첫번째 원소의 인덱스를 저장
			int p = start; 
			int q = mid + 1; 
			int idx = p; 
			
			while (p <= mid || q <= end) { //동시에 종료가 되지 않을 수 있으므로 ||처리
				if (q > end || (p <= mid && numbers[p] < numbers[q])) { 
					tmp[idx++] = numbers[p++];
				} else { 
					tmp[idx++] = numbers[q++]; 
				} 
			} 
			
			//정렬한 것 다시 numbers에 집어넣기
			for (int i=start;i<=end;i++) { 
				numbers[i] = tmp[i]; 
			} 
		} 
	}
}
