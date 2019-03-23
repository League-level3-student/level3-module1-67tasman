package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton("Suprise Me!");
	ArrayList<Song> songs = new ArrayList<Song>(4);
	

	public _06_IPodShuffle() {
		songs.add(new Song("beat1.mp3"));
		songs.add(new Song("beat2.mp3"));
		songs.add(new Song("beat3.mp3"));
		songs.add(new Song("beat4.mp3"));
		//songs.get(0).play();
	//	new Song("beat1.wav").play();
		// 1. Use the Song class the play the demo.mp3 file.
		//Song demo = new Song("demo.mp3");
		//demo.play();	
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */	
		
	}
	
	public static void main(String[] args) {
		
		_06_IPodShuffle i = new _06_IPodShuffle();
		i.GUI();
	}
	
	void GUI(){
		frame.add(button); 
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(button == pressed) {
		songs.get(0).stop();
		songs.get(1).stop();
		songs.get(2).stop();
		songs.get(3).stop();
		int i = (int)(Math.random() * ((3) + 1));
		System.out.println(i);
		Song s = songs.get(i);
		s.play();
		
		}
	}
}