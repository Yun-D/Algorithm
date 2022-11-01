import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String temp = "";
		
		while ( (temp = br.readLine()) != null ) {	
			
			while (temp.contains("BUG")) {
        		if (temp.contains("BUG"))
        			temp = temp.replace("BUG", "");
        	}
			
			System.out.println(temp);
			
		}
		
	}
}
