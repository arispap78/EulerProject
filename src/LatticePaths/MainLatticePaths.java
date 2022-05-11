package LatticePaths;

import java.math.BigInteger;

/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
 */
class MainLatticePaths 
{
	static BigInteger LatticePaths(int a,int b)
	{
		BigInteger paths;
		int total=a+b;
		BigInteger numerator=new BigInteger("1");
		long denominator=1;
		for(int i=total-a+1;i<=total;i++)
			numerator=numerator.multiply(BigInteger.valueOf(i)); 
		for(int j=2;j<=a;j++)
			denominator*=j;
		System.out.println(numerator);
		System.out.println(denominator);
		paths=numerator.divide(BigInteger.valueOf(denominator));
		return paths;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(MainLatticePaths.LatticePaths(20,20));
		
	}
}
