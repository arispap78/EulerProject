package LargestPrimeFactor;

public class MySolution2
{
	static Boolean isPrime(long number) 
	{
		if(number==1||number==2)
			return true;
		else if(number%2==0)
			return false;
		else 
			for(long i=3;i<number;i+=2) 
			{
				if(number%i==0)
					return false;
			}
		return true;
	}
	
	static long LargestFactor(long number) 
	{
		for(int i=2;i<number;i++) 
		{
			long l=number/i;
			if(number%i==0 &&isPrime(l))
				return l;
		}
		return 0;			
	}
}