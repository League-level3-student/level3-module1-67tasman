package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	String word;
	int length;
	JLabel label;
	String text = "";
	int rounds;
	Stack<String> words = new Stack<String>();
	public static void main(String[] args) {
HangMan hangman = new HangMan();
hangman.setup();
hangman.guess();
		
	}
	void setup(){
		String String_rounds = JOptionPane.showInputDialog("How many rounds would you like to play?");
		rounds = Integer.valueOf(String_rounds);
		for(int i = 0 ; i < rounds ; i++) {
		String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(dictionary);
		}
		word = words.pop().toString();
		length = word.length();
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		label = new JLabel();
		JPanel panel = new JPanel();
		panel.add(label);
		frame.add(panel);
		//frame.pack();
		frame.setVisible(true);
		
	}
	
	
	void guess() {
		for(int j = 0 ; j<rounds ; j++) {
			for(int i = 0; i < length ; i++) {
				text += "_ ";
			}
			label.setText(text);
		int incorrect = 0;
		while(incorrect<12) {
		String remaining = 12-incorrect + "";
		String stringguess = JOptionPane.showInputDialog("Guess a letter. " + "You have " + remaining + " trys.");
		char guess = stringguess.charAt(0);
		if(word.contains(stringguess)) {
		for(int i = 0; i < length ; i++) {
			if(guess == word.charAt(i)) {
			text = text.substring(0,i*2) + guess + text.substring(i*2+1);
			label.setText(text);
		}
			//else {
				
			//}
		}
		}
		else {
			incorrect = incorrect+1;
			JOptionPane.showMessageDialog(null, "Wrong, try again.");
		}
		text = "";
		String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(dictionary);
		}
		word = words.pop().toString();
		}
		}
		
		
		
	}
	
	

