package LargestPrimeFactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

class MySolution 
{
	static int PrimeFactor(int number) 
	{
		int factor=0;
		Boolean [] primes=new Boolean[number];
		Arrays.fill(primes, true);
		for(int i=2;i<=Math.sqrt(number);i++) 
		{
			System.out.println(i);
			for(int j=i*i;j<number;j+=i) {
				System.out.println(j);
				primes[j]=false;}
		}
		for(int a=0;a<number;a++)
			System.out.println(primes[a]+" "+a);
		for(int g=number/2;g>0;g--)
		{
			if(primes[g]==true&& number%g==0) 
			{
				System.out.println(g);
				factor=g;
				break;
			}
		}
		return factor;
	}

}
