package Prime10001st;

import java.util.ArrayList;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
class MySolution 
{
	
	public static int Primest() 
	{
		ArrayList<Integer> primes=new ArrayList<>();
		primes.add(2);
		for(int i=3;i>2;i+=2) 
		{
			 primes.add(i);
			 for(int j=0;j<primes.size()-1;j++) 
			 { 
				  if(i%primes.get(j)==0) 
				  { 
					  primes.remove(primes.size()-1); 
					  break; 
				  }
			  
			 }
			 if(primes.size()>=10001)
				 break;
				 
		}
		return primes.get(primes.size()-1);
	}
	
}
