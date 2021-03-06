package hourrank11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrangeCode {
	
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
		
		long time = Reader.nextLong();
		
		long intialTime = 1;
		long initialValue = 3;
		
		while(intialTime < time){
			
			intialTime += initialValue ;
			initialValue *= 2;
		}
		
		if(intialTime == time)
			System.out.println(initialValue);
		else{
			initialValue = initialValue/2;
			intialTime -= initialValue;
			long diff = Math.abs(intialTime - time);
			long value = initialValue - diff;
			System.out.println(value);
		}
	}

}
