package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	int length;
	JLabel label;
	public static void main(String[] args) {
HangMan hangman = new HangMan();
hangman.setup();
		
	}
	void setup(){
		String String_rounds = JOptionPane.showInputDialog("How many rounds would you like to play?");
		int rounds = Integer.valueOf(String_rounds);
		Stack<String> words = new Stack<String>();
		for(int i = 0 ; i < rounds ; i++) {
		String word = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(word);
		}
		length = words.pop().toString().length();
		JFrame frame = new JFrame();
		label = new JLabel();
		JPanel panel = new JPanel();
		panel.add(label);
		frame.add(panel);
		displayText();
		frame.pack();
		frame.setVisible(true);
	
		
	}
	void displayText(){
		String text = "";
		for(int i = 0; i < length ; i++) {
			text += "_ ";
		}
		label.setText(text);
	}
}
