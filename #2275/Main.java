import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] apartment = new int[15][15];

    //초기화
    for (int i=0;i<15;i++) {
    	apartment[i][0] = 1; //i층 1호는 항상 1이다.
    	apartment[0][i] = i+1; //0층 i호는 i명이 살고 있다.
    }

    for (int k=1;k<15;k++) { //k=층,n=호 
      for (int n=1;n<15;n++) {
    	  apartment[k][n] = apartment[k-1][n] + apartment[k][n-1];
      }
    }
    
    int t = Integer.parseInt(br.readLine());

    for (int z=0;z<t;z++) {
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      
      System.out.println(apartment[a][b-1]);
    }
  }
}