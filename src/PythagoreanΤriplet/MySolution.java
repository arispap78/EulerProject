package PythagoreanÔriplet;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

class MySolution 
{
	static int Triplet(int number)
	{
		int product=1;
		for(int i=1;i<333;i++)
		{
			for(int j=i+1;j<500;j++) 
			{
				for(int k=j+1;k<1000;k++) {
					if((k*k==i*i+j*j)&&(i+k+j==number))
					{
						product=k*j*i;
						System.out.println(i+" "+j+" "+k);
					}		
				}
			}
		}
		return product;		
	}
}
