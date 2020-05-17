package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTreeContainsJUnitTest {

	@Test
	void test() {
		SearchTree<Integer> searchTree = new SearchTree<>();
		assertFalse(searchTree.containsRek(4));		
		searchTree.add(4);
		assertTrue(searchTree.containsRek(4));		
		searchTree.add(0);
		assertTrue(searchTree.containsRek(0));
		searchTree.add(8);
		searchTree.add(9);
		searchTree.add(2243);
		assertTrue(searchTree.containsRek(2243));
		
	}

}
