package LargeSum;

/*
 * Have you ever seen a car's odometer? If you have, you will notice that the digits in the far right increase fastest while you drive. 
 * The next digit, i.e. towards the left updates less frequently (ten times slower). 
 * The next is even slower and the left-most digit is the slowest; it doesn't update even if you drive for hours at a stretch.
 * 
 * What is its relation to the problem at hand? We must understand the significance of the least significant digits is to provide 
 * the "carry" to be added to the next significant digit. Let's take our analogy and proceed with it. The rightmost digits act as the miles,
 * tens-of-miles, hundreds-of-miles counters, that update frequently. When they cross 9 and return to 0, they increment the immediate 
 * left digit.
 * It is essentially updating using the carry. These carries too become lesser and lesser in frequency as we move leftwards.
For ample, take 10,950 and 15,456. Add them up and you get 26,406. We want the first two digits of their sum. 
If we take 10,000 and 15,000, we get a slightly different answer: 25,000.
If we analyse the first 2 (i.e. leftmost) digits of the answers, we see that they 25 and 26 differ in their one's place. 
Their first digits match up. That's why I said "slightly".
In order to improve the precision, take an extra (buffer) digit. Using three digits: 109+154=263. 
There you go! We now have the answers matching in their first two digits.
 This theory can be generalized to obtain the first n digits of the sum of a collection of numbers (of length more than n digits). 
 The number of buffer digits depends on the "number of numbers" A rough relation would be
No. of buffer digits=log(no. of items)
Trial and error supports this. I urge you to prove it yourself.
 */


class Solution1 
{
	public static void main(String[] args) {
        String[] numbers = {
            // The big long list
            };
        long time = System.nanoTime();
        String result = sum(numbers, 10).substring(0, 10);
        time = System.nanoTime() - time;
        System.out.println("Result: " + result + "\nTime in nanoseconds: " + time);
    }

    public static String sum(String[] values, int numberOfDigits) {
        // best to take an overestimate
        int buffer = (int) Math.ceil(Math.log10(values.length)); // = 2 for 50
        int length = numberOfDigits + buffer;
        long result = 0;
        for (String value : values) {
            result += Long.parseLong(value.substring(0, length));
        }
        return String.valueOf(result);
    }
}
