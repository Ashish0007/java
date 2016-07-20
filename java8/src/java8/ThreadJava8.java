package java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		IntStream.range(0, 10).forEach(i -> 
			executorService.submit(
					() -> System.out.println("Running task " + i)
					)
		);


		System.out.println("Tasks submitted");
		executorService.shutdown();

	}

}
 