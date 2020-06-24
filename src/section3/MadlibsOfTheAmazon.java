package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it ...");
		// Get the user to enter an adjective
		String userAdjective = JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
		String userLiquid = JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
		String userBodypart = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String userVerb = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
		String userPlace = JOptionPane.showInputDialog("Enter a place");
		
		JOptionPane.showMessageDialog(null, 

		
		// Make a pop-up for the final story. You can use \n to go to the next line
				"Piranhas are more " + userAdjective + " during the day, so cross the river at\n" + 
				"night. Piranhas are attracted to fresh " + userLiquid + " and will most\n" + 
				"likely take a bite out of your " + userBodypart + " if you " + userVerb + ". Whatever\n" + 
				"you do, if you have an open wound, try to find another way to get\n" + 
				"back to the " + userPlace + ". Good luck! ");

	}
}

