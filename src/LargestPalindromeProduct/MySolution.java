package LargestPalindromeProduct;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

class MySolution
{
	
	static boolean isPalindrome(int number)
	{
		String palindrome=String.valueOf(number);
		char[] array=palindrome.toCharArray();
		Deque<Character>deq=new ArrayDeque<Character>();
		for(char a:array)
			deq.push(a);
		while(deq.size()>1)
		{
			if(!deq.pollFirst().equals(deq.pollLast()))
				return false;
		}
		return true;
	}
	
	static int check() 
	{
		int max=0;
		int res=0;
		for(int i=999;i>=100;i--) 
		{
			for(int j=999;j>=100;j--) 
			{
				res=i*j;
				if(isPalindrome(res)&&(res>max)) {
					max=res;
				}
					
			}
			
		}return max;
	}
}
