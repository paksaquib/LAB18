package DICE;

import javax.swing.JOptionPane;

public class TEST_DICE {
		
		public static void main(String[] args) {
			int DiceRollStatic = 2;
			int DiceRollPublic1 = 5;
			int DiceRollPublic2 = 4;
			int DiceRollPublic3 = 8;
			int count = 0;
			
			DICE Roll_1_Dice = new DICE();
			DICE Roll_2_Dice = new DICE();
			DICE Roll_3_Dice = new DICE();
			
			//Call DICE class static method just to test
			DICE.sRollDice(DiceRollStatic, 6);
			
			Roll_1_Dice.pRollDice(DiceRollPublic1, 6);
			Roll_2_Dice.pRollDice(DiceRollPublic2, 6);
			Roll_3_Dice.pRollDice(DiceRollPublic3, 6);
			
			JOptionPane.showMessageDialog(null, "Total Dice Rolled Static" + DICE.sRollCount() + 
												"\nTotal Dice Public Method 1 Rolled " + Roll_1_Dice.pRollCount() + 
												"\nTotal Dice Public Method 2 Rolled " + Roll_2_Dice.pRollCount() + 
												"\nTotal Dice Public Method 3 Rolled   " + Roll_3_Dice.pRollCount() , "Statics", JOptionPane.PLAIN_MESSAGE);
			
			//Roll object Roll_1_Dice 10 more time to see its working properly
			while (count<10)
			{
				Roll_1_Dice.pRollDice(1, 6);
				Roll_1_Dice.pRollCount();
				count++;
			}
			
			JOptionPane.showMessageDialog(null, "Total Dice Rolled Static" + DICE.sRollCount() + 
					"\nTotal Dice Public Method 1 Rolled " + Roll_1_Dice.pRollCount() + 
					"\nTotal Dice Public Method 2 Rolled " + Roll_2_Dice.pRollCount() + 
					"\nTotal Dice Public Method 3 Rolled   " + Roll_3_Dice.pRollCount() + "\n\nGoodbye!!!!", "Statics", JOptionPane.PLAIN_MESSAGE);
		}
}
