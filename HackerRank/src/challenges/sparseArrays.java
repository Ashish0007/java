package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class sparseArrays {
	
	static class Reader {
		static BufferedReader reader;
		static StringTokenizer tokenizer;

		/** call this method to initialize reader for InputStream */
		static void init(InputStream input) {
			reader = new BufferedReader(new InputStreamReader(input));
			tokenizer = new StringTokenizer("");
		}

		/** get next word */
		static String next() throws IOException {
			while (!tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		static int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		static double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		static long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}

	public static void main(String[] args) throws IOException {

		Reader.init(System.in);
		
		Map<String,Integer> map = new HashMap<>();
		
		int noOfStrings = Reader.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i<noOfStrings;i++){
			
			String str = Reader.next();
			
			if(map.containsKey(str)){
				
				int counter = map.get(str);
				counter++;
				map.put(str, counter);
			}else{
				map.put(str, 1);
			}
		}
		
		int noOfQueries = Reader.nextInt();
		
		for(int i = 0; i<noOfQueries;i++){
			
			String str = Reader.next();
			if(!map.containsKey(str))
				result.append(0+"\n");
			else
				result.append(map.get(str) + "\n");
		}
		
		System.out.println(result);
	}

}
