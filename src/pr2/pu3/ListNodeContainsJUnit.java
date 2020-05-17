package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListNodeContainsJUnit {

	@Test
	void test() {
		ListNode<Integer> list = new ListNode<>(3);
		list=list.addFirst(2);
		list=list.addFirst(6);
		list=list.addFirst(4);
		list=list.addFirst(11);
		list=list.addFirst(90);
		
		//testet iterative Methode
		assertTrue(list.containsIter(3));
		assertTrue(list.containsIter(2));
		assertTrue(list.containsIter(4));
		assertTrue(list.containsIter(11));
		assertTrue(list.containsIter(90));
		assertFalse(list.containsIter(0));
		
		//testet rekursive Methode
		assertTrue(list.contains(3));
		assertTrue(list.contains(2));
		assertTrue(list.contains(4));
		assertTrue(list.contains(11));
		assertTrue(list.contains(90));
		assertFalse(list.contains(0));
		
		
		ListNode<String> listString = new ListNode<>("Test!");
		listString=listString.addFirst("ein ");
		listString=listString.addFirst("ist ");
		listString=listString.addFirst("Das ");
		listString=listString.addFirst("Hallo! ");
		
		//testet iterative Methode
		assertTrue(listString.containsIter("Das "));
		assertTrue(listString.containsIter("Hallo! "));
		assertTrue(listString.containsIter("ein "));
		assertTrue(listString.containsIter("Test!"));
		assertFalse(listString.containsIter("isNichtDrin"));	
		
		//testet rekursive Methode
		assertTrue(listString.contains("Das "));
		assertTrue(listString.contains("Hallo! "));
		assertTrue(listString.contains("ein "));
		assertTrue(listString.contains("Test!"));
		assertFalse(listString.contains("isNichtDrin"));
	}

}
