import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		
		
		BigInteger money = n.divide(m);
		BigInteger remainder = n.remainder(m);
		
		System.out.println(money);
		System.out.println(remainder);		
	}
}
