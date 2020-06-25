package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		

		int quizScore = 0;
		String userAnswer1 = JOptionPane.showInputDialog("What is the capital of Canada?");
		if ((userAnswer1.equalsIgnoreCase("ottawa"))) {
			quizScore+=1;
			JOptionPane.showMessageDialog(null, "You were correct! Your score is now " + quizScore + "!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. Your score is still " + quizScore + "!");
		}
		String userAnswer2 = JOptionPane.showInputDialog("What is the largest country in the world?");
		if ((userAnswer2.equalsIgnoreCase("russia"))) {
			quizScore+=1;
			JOptionPane.showMessageDialog(null, "You were correct! Your score is now " + quizScore + "!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. Your score is still " + quizScore + "!");
		}
		String userAnswer3 = JOptionPane.showInputDialog("What is the largest river in the world?");
		if ((userAnswer3.equalsIgnoreCase("amazon river"))) {
			quizScore+=1;
			JOptionPane.showMessageDialog(null, "You were correct! Your score is now " + quizScore + "!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. Your score is still " + quizScore + "!");
		}
		String userAnswer4 = JOptionPane.showInputDialog("What is the smallest country in the world?");
		if ((userAnswer4.equalsIgnoreCase("Vatican City"))) {
			quizScore+=1;
			JOptionPane.showMessageDialog(null, "You were correct! Your score is now " + quizScore + "!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You were wrong. Your score is still " + quizScore + "!");
		}
		if (quizScore > 3) {
			JOptionPane.showMessageDialog(null, "Wow! You got all the questions correct! Congratulations!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good job! You got a score of " + quizScore + "/4! Can you do better next time?");
		}
	}
}
