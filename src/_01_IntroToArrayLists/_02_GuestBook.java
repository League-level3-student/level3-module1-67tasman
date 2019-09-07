package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	String name;
	int x = 0;
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
	_02_GuestBook g = new _02_GuestBook();
	g.guestBook();
	
}
	
	void guestBook(){
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name");
		button2.setText("View Names");
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(button == pressed) {
			name =	JOptionPane.showInputDialog("Enter a name:");
			x++;
			names.add("Guest #"+ x +": "+ name + "\n");
System.out.println(x);
		}
		
		if(button2 == pressed) {
			
		JOptionPane.showMessageDialog(null, names);
		}
	}
}
