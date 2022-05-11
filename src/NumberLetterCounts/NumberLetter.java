package NumberLetterCounts;

/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 
(one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
 */

class NumberLetter 
{
	static int CountLetters() 
	{
		int sum=0;
		//the sum or the letters from 1-9(appears 9*10 times)
		int sum9=36;
		//the sum of the letters from 10-19(appears 10 times)
		int sum19=70;
		//the letters of the tenths 10,20,..,90(each one appears 10*10 times) 
		int n20=6;
		int n30=6;
		int n40=5;
		int n50=5;
		int n60=5;
		int n70=7;
		int n80=6;
		int n90=6;
		//the letters of the hundreds 100,200,...,900(each one appears 100 times)
		int n100=10;
		int n200=10;
		int n300=12;
		int n400=11;
		int n500=11;
		int n600=10;
		int n700=12;
		int n800=12;
		int n900=11;
		//the word "and" appears 99*9 times
		int and=99*9*3;
		//the word one thousand
		int n1000=11;
		sum=sum9*90+sum19*10+(n20+n30+n40+n50+n60+n70+n80+n90)*100+(n100+n200+n300+n400+n500+n600+n700+n800+n900)*100+and+n1000;
		return sum;	
	}
	
	public static void main(String[]args) 
	{
		System.out.println(NumberLetter.CountLetters());
	}
}
