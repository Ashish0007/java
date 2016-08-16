package worldCodeSprint5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringConst {

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
		
		int testCases = Reader.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i<testCases; i++){
			
			String str = Reader.next();
			Set<Character> set = new HashSet<>();
			for(int j = 0 ; j<str.length(); j++){
				set.add(str.charAt(j));
			}
			result.append(set.size()+"\n");
		}
		System.out.println(result);
	}

	
}
