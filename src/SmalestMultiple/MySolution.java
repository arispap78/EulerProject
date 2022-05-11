package SmalestMultiple;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

class MySolution
{
	static int SmalestMultipleNumber()
	{
		int smalest=0;
		for(int j=380;j>1;j+=20)
		{
			smalest=j;
			for(int i=11;i<=20;i++)
			{
				if(smalest%i!=0)
					break;
				else if(i==20)
					return smalest;
			}
		}
		return smalest;
	}

}
