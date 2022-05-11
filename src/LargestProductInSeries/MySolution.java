package LargestProductInSeries;
/*
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */

class MySolution 
{
	static long LargestProduct(String series) 
	{
		long product=1;
		long max=0;
		int cnt=0;
		int [] array=new int[1000];
		for(int i=0;i<1000;i++)
			array[i]=Integer.parseInt(String.valueOf(series.charAt(i)));
		for(int j=0;j<988;j++) 
		{
			product=1;
			for(int k=j;k<(j+13);k++)
				product*=array[k];
			if(product>=max)
				max=product;
		}
		return max;
	}
}
