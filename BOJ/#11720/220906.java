import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  int answer = 0;
	  int n = Integer.parseInt(br.readLine());
	  String num = br.readLine();
	  
	  char[] num_char = num.toCharArray(); //char형으로 변환
	  
	  for (int i=0; i<n; i++) {
		  answer += num_char[i] - '0';
	  }
	  
	  System.out.println(answer);
  }
}