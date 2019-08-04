package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
		_03_TestMatchingBrackets test = new _03_TestMatchingBrackets(); 
		//test.doBracketsMatch(b);
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> a = new Stack<String>();
	
		int l = a.toString().length();
		if(l%2==1) {
			return false;
		}
		int q = 0;
		for(int i = 0; i<b.length() ; i++) {
			
			if(b.charAt(i)=='}'){
				if(a.size()>0) {
					a.pop();
				}
				else {
					return false;
				}
			}
			else {
				a.push(".");
			}
			
		}
		if(a.size()>0) {
			return false;
		}	
		else {
			return true;
			
		}
	
		
	
	}

}