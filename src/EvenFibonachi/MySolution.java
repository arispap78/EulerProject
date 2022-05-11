package EvenFibonachi;

/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
 */

class MySolution 
{
	public static int EvenFibonachiNumber(int a,int b,int s) 
	{
		int sum=s;
		int c=a+b;
		if(c<=4000000) 
		{
			if(c%2==0)
				sum+=c;
			return EvenFibonachiNumber(b,c,sum);
		}
			
		else
			return sum;
	}
}