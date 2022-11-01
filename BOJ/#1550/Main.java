import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String toHex = br.readLine();
		int hexNum = Integer.parseInt(toHex, 16);
		
		System.out.println(hexNum);
	}
}
