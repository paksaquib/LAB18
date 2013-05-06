package DICE;

//import javax.swing.JOptionPane;

public class DICE {
	static int sTotalRollCount;
	int pTotalRollCount;
	
	static void sRollDice(int NoOfDice, int MaxValue)
	{
		int count = 1;
		int diceValue = 0;
		int totalDiceValue = 0;
		
		while (count<=NoOfDice)
		{
			diceValue = 1 + (int)(Math.random()*MaxValue);
			totalDiceValue = totalDiceValue + diceValue;
			//Comment Put a line just to check method working properly
			//JOptionPane.showMessageDialog(null, "Dice " + count + "\nDice Value " + diceValue + "\nTotal Dice Value " + totalDiceValue, "Statics", JOptionPane.PLAIN_MESSAGE);
			sTotalRollCount++;
			count++;
		}
	}
public void pRollDice(int NoOfDice, int MaxValue)
	{
		int count = 1;
		int diceValue = 0;
		int totalDiceValue = 0;
		
		while (count<=NoOfDice)
		{
			diceValue = 1 + (int)(Math.random()*MaxValue);
			totalDiceValue = totalDiceValue + diceValue;
			pTotalRollCount++;
			//Comment Put a line just to check method working properly
			//JOptionPane.showMessageDialog(null, "Dice " + count + "\nDice Value " + diceValue + "\nTotal Dice Value " + totalDiceValue + "\nOverall Dice Roll " + pTotalRollCount, "Statics", JOptionPane.PLAIN_MESSAGE);
			count++;
		}
}

	
	static int sRollCount()
	{
		return sTotalRollCount;	
	}

	public int pRollCount()
	{
		return pTotalRollCount;	
	}

	
}
