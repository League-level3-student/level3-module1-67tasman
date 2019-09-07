package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
	
	
	_02_LogSearch log = new _02_LogSearch();
	log.GUI();
	}
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton("Input");
	JButton b2 = new JButton("Search");
	JButton b3 = new JButton("View All");
	JButton b4 = new JButton("Remove");
	void GUI(){
		f.add(p);
		b1.addActionListener(this);
		p.add(b1);
		b4.addActionListener(this);
		p.add(b4);
		b2.addActionListener(this);
		p.add(b2);
		b3.addActionListener(this);
		p.add(b3);
		f.setVisible(true);
		f.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(b1.equals(e.getSource())) {
			String ID_String = JOptionPane.showInputDialog("Enter an ID number:");
			String name = JOptionPane.showInputDialog("Enter a name:");
			int ID = Integer.parseInt(ID_String);
			h.put(ID, name);
		}
		if(b2.equals(e.getSource())) {
			String ID_String2 = JOptionPane.showInputDialog("Enter an ID number:");
			int ID2 = Integer.parseInt(ID_String2);
			if(h.containsKey(ID2)) {
				JOptionPane.showMessageDialog(null, h.get(ID2));
			}
			else {
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
			
		}
		if(b3.equals(e.getSource())) {
			String list = "";
			for(int key : h.keySet()) {
				list = list + "\nID: " + key + "  Name: " + h.get(key);
				
			}
			JOptionPane.showMessageDialog(null, list);
		}
		if(b4.equals(e.getSource())) {
			String ID_String4 = JOptionPane.showInputDialog("Enter an ID number:");
			int ID4 = Integer.parseInt(ID_String4);
			if(h.containsKey(ID4)) {
				h.remove(ID4);
			}
			else {
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
			
		}
		
	}
	
	
}
