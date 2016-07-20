 package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PrimeAndSqrtUsingStreams {
	
	public static boolean isPrime(int number){
		
		return number > 1 && IntStream.range(2, number)
									  .noneMatch( i -> number % i == 0);
	}
	
	public static void main(String[] args) {
		
		List<Integer> listOfFirst100Primes = Stream.iterate(1, e -> e+1)
													.filter(PrimeAndSqrtUsingStreams :: isPrime)
												//	.map(Math::sqrt)
													.limit(100)
													.collect(Collectors.toList());
		
		listOfFirst100Primes.forEach(System.out :: println);
		
	//	listOfFirst100Primes.Stream.forEach(System.out :: println);
	}

}
