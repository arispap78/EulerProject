package LongestCollatzSequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
NOTE: Once the chain starts the terms are allowed to go above one million.
 */

class MySolution 
{
	static int sequence=2;
	static int CollatzSequence(int number) 
	{
		Set<Integer>collatz=new HashSet();
		ArrayList<Long>array=new ArrayList<>();
		long next=1;
		int nex=1;
		int max=0;
		for(int i=number/2;i<number;i++) 
		{
			collatz.add(i);
		}
		Iterator it=collatz.iterator();
		while(it.hasNext()) 
		{
			
			next= (int) it.next();
			nex=(int)next;
			array.clear();
			int sequence=1;
			while(next>1)
			{
				array.add(next);
				if(next%2==0) 
				{
					next=next/2;				
				}
				else 
				{
					next=3*next+1;
				}
				//if(collatz.contains(next))
					//collatz.remove(next);
				sequence+=1;
			}
			if(sequence>max) 
			{ 
				System.out.println(nex);
				System.out.println("-----");
				System.out.println(array.get(0));
				max=array.size()+1;
			}
		}
		
		return max;
		
	}
}
