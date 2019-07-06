package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> a = new ArrayList<String>();

		//2. Add five Strings to your list
		a.add("a");
		a.add("hh");
		a.add("ffe");
		a.add("le");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0 ; i < a.size() ; i ++){
			String b = a.get(i);
			System.out.println(b);
		}
		
		//4. Print all the Strings using a for-each loop
		for(String b : a){
			System.out.println(b);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0 ; i < a.size() ; i=i+2){
			String b = a.get(i);
			System.out.println(b);
		}
		
		//6. Print all the Strings in reverse order.
		for(int i = a.size()-1 ; i > -1 ; i=i-1){
			String b = a.get(i);
			System.out.println(b);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0 ; i < a.size() ; i ++){
			String b = a.get(i);
			if(b.contains("e")) {
				System.out.println(b);
			}
		}
		
	}
}
