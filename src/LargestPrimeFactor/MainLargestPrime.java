package LargestPrimeFactor;

public class MainLargestPrime 
{
	public static void main(String[]args) 
	{
		//int max=MySolution.PrimeFactor(600851475143l);
		long max=MySolution2.LargestFactor(600851475143l);
		//boolean max=MySolution2.isPrime(81);
		System.out.println(max);
	}
}
