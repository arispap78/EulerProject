package SummationPrimes;

import java.util.ArrayList;

class MySolution
{
	static long Summation(int number)
	{
		long sum=0;
		ArrayList<Integer>primes=new ArrayList<>();
		for(int i=0;i<=number;i++)
			primes.add(i);
		for(int j=2;j<=(int)Math.sqrt(number);j++) 
		{
			if(primes.get(j)!=0) 
			{
				for(int k=j*2;k<=number;k+=j)
					primes.set(k,0);	
			}
		}
		for(int i=2;i<=number;i++)
			if(primes.get(i)!=0) 
			{
				sum+=primes.get(i);
				System.out.println(primes.get(i));
			}
		return sum;
	}

}
