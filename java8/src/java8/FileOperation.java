package java8;

import java.io.File;
import java.util.stream.Stream;
 import static java.util.stream.Collectors.*;

public class FileOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File(".");
		
		File[] children = dir.listFiles();
		
	
		System.out.print( Stream.of(children)
									.map(File::getName)
									.map(String::toUpperCase)
									.collect(joining(","))
				);
	}

}
