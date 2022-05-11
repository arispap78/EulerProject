package PowerDigitSum;

import java.math.BigInteger;

/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 21000?
 */

class MainPowerDigit 
{
	static int PowerSum() 
	{
		int sum=0;
		BigInteger digit=new BigInteger("2");
		BigInteger powerDigit=digit.pow(1000);
		String convert=String.valueOf(powerDigit);
		for(int i=0;i<convert.length();i++) 
		{
			sum+=Integer.parseInt(Character.toString(convert.charAt(i)));
		}	
		return sum;
	}
	public static void main(String[]args) 
	{	
		System.out.println(MainPowerDigit.PowerSum());
	}
}


