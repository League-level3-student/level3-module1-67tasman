package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();	
	Stack<String> t = new Stack<String>();
	Stack<String> undo = new Stack<String>();
	
	
	public static void main(String[] args) {
		 _02_TextUndoRedo text = new  _02_TextUndoRedo();
		 text.GUI();
	
	
	}
	
	
	
	void GUI(){
		p.add(l);
		f.add(p);
		f.addKeyListener(this);
		f.setVisible(true);
		int sz = t.size();
		
		f.pack();
	
	
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() >= 32 && e.getKeyCode() <= 126) {
		t.push(e.getKeyChar()+"");
		l.setText(l.getText() + e.getKeyChar());
		}
		
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
		String last = "" + l.getText().charAt(l.getText().length()-1);
		System.out.println(last);
		undo.push(last);
		String s = l.getText().substring(0, l.getText().length()-1);
		l.setText(s);	
		}
	if(e.getKeyCode()==27) {
		String undone = l.getText() + undo.pop() ;
		l.setText(undone);
	}
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	
