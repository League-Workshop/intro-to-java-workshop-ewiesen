package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 250;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		int playerHeal = 0;

		Random randy = new Random();
		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
														// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String userAnswer = JOptionPane.showInputDialog(null,
					"Do you want to attack the dragon with a yell,\n a kick, or heal to get back some health?");
			// 9. If they typed in "yell":
			if (userAnswer.equalsIgnoreCase("yell")) {

				// -- Find a random number between 0 and 10 and store it in dragonDamage
				dragonDamage = randy.nextInt(11);
				// -- Subtract that number from the dragon's health variable
				dragonHealth -= dragonDamage;
				JOptionPane.showMessageDialog(null,
						"You yelled and made the dragon tremble in fear!\n You dealt " + dragonDamage + " damage!");
				playerDamage = randy.nextInt(36);
				playerHealth -= playerDamage;
				JOptionPane.showMessageDialog(null,
						"The dragon roared back in rage!\n The dragon dealt " + playerDamage + " damage!");
			}
			// 10. If they typed in "kick":
			if (userAnswer.equalsIgnoreCase("kick")) {

				// -- Find a random number between 0 and 25 and store it in dragonDamage
				dragonDamage = randy.nextInt(26);
				// -- Subtract that number from the dragon's health variable
				dragonHealth -= dragonDamage;
				JOptionPane.showMessageDialog(null,
						"You kicked the dragon's butt!\n You dealt " + dragonDamage + " damage!");
				playerDamage = randy.nextInt(36);
				playerHealth -= playerDamage;
				JOptionPane.showMessageDialog(null,
						"The dragon angrily slashed you with his sharp claws!\n The dragon dealt " + playerDamage
								+ " damage!");
			}
			if (userAnswer.equalsIgnoreCase("heal")) {
				playerHeal = randy.nextInt(41);
				playerHealth += playerHeal;
				JOptionPane.showMessageDialog(null, "You healed " + playerHeal + " health!");
				playerDamage = randy.nextInt(36);
				playerHealth -= playerDamage;
				JOptionPane.showMessageDialog(null,
						"The dragon spat fire on you while you were healing!\n The dragon dealt " + playerDamage
								+ " damage!");
			}

			// 13. If the user's health is less than or equal to 0
			if (playerHealth < 1) {

				// -- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You lost! The dragon has defeated you.");
			}
			// 14. Else if the dragon's health is less than or equal to 0
			else if (dragonHealth < 1) {

				// -- Tell the user that the dragon is dead and they took a ton of gold!
				JOptionPane.showMessageDialog(null,
						"The dragon is dead! You have defeated the beast and stole a ton of gold!");
			}
			// 15. Else
			else {

				// -- Pop up a message that tells the their current health and the dragon's
				// currently health (Bonus: Also display the amount of health that was lost for
				// each player this round)
				JOptionPane.showMessageDialog(null, "Your current health is " + playerHealth
						+ "! The dragon's current health is " + dragonHealth + "!");

			}
		}
	}
}

