package java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 10; i++){
			
			 int index = i;
			executorService.submit(new Runnable(){
				
				public void run(){
					System.out.println("Running task "+ index);
				}
			});
		}

		System.out.println( "Tasks submitted");
		executorService.shutdown();
	}

}
