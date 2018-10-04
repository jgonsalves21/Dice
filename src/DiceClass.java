
public class DiceClass 
{

	private int numRoll;
	
	
	
	public void Dice()
	{
		
		numRoll = 0;
		
	}
	
	
	
	public int roll()
	{
		
		return (int)(Math.random()*6)+1;
		
		numRoll++;
		
	}
	
	public int getRoll()
	{
		return numRoll;
	}
	
	public void reset()
	{
		numRoll = 0;
	}
	
	public int getNumRoll()
	{
		return numRoll;
	}
	
	
	
	
	
	
	
	
}
