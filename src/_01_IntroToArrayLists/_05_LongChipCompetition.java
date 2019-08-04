package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class _05_LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
  
	public static void main(String[] args) {
		_05_LongChipCompetition lcc = new _05_LongChipCompetition();
		lcc.initializeBeatles();
		//Where do i do the for loop?
	  lcc.findLongestChip();
	}
	public void findLongestChip(){
		double longest2 = 0;
		int i;
		int beatleNum = 0;
		  for (i = 0; i < theBeatles.size(); i++) {
		    	//System.out.println(theBeatles.get(i).getChips().size());
		    	int numOfChips = theBeatles.get(i).getChips().size();
		    	double longest= 0;
		    	for (int j = 0; j < numOfChips; j++) {
		    		double length = theBeatles.get(i).getChips().get(j).getLength();
		    		//System.out.println(theBeatles.get(i).getChips().get(j).getLength());
		    		if(longest < length) {
		    			longest = length;
		    		}
		    	}
		    	//System.out.println(theBeatles.get(i).getName() + " has a " + longest + " inch chip.");
		    	String name = theBeatles.get(i).getName();
		    	/* double georgeChip = longest;
		    	double johnChip = longest;
		    	double paulChip = longest;
		    	double ringoChip = longest; */
		    	//System.out.println(longest);
		    
		    	if(longest>longest2) {
		    		longest2 = longest;
		    		//System.out.println(i);
		    		beatleNum++;
		    		//System.out.println(beatleNum);
		    		
		    	}
		    
		    }
			//System.out.println(beatleNum);
			System.out.println(theBeatles.get(beatleNum-1).getName() + " wins");
		//  System.out.println(longest2);
			
	}
	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
	
	public ArrayList<Beatle> getTheBand(){
		return theBeatles;
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
