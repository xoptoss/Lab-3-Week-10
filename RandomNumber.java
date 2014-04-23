package mainPackage;

import java.util.Random;

public class RandomNumber {

	int answer,high,low,newHigh,newLow;
	Random random = new Random();
	
	public RandomNumber(int newHigh)
	{
		high=newHigh;	
	}
	public int GetANumber()
	{
		answer = random.nextInt(high);
		return answer;	
	}
	public int setHighNumber(int newHigh)
	{
		high = newHigh;
		return high;
	}
}
