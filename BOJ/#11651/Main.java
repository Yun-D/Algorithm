import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num =  Integer.parseInt(br.readLine());
		int[][] xy = new int [num][2];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			xy[i][0] = Integer.parseInt(st.nextToken()); //x 좌표
			xy[i][1] = Integer.parseInt(st.nextToken()); //y 좌표
		}
		
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) { //만약 y좌표 값이 같다면
					return o1[0] - o2[0]; //x좌표 값 비교
				} else
					return o1[1] - o2[1];
			}
		});
		
		for (int i=0; i<num; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
}
