package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTreeIsEmptyJUnit {

	@Test
	void test() {
		SearchTree<Integer> searchTree = new SearchTree<>();
		searchTree.add(7);
		searchTree.add(8);
		SearchTree<Integer> emptyTree = new SearchTree<>();

		
		assertFalse(searchTree.isEmpty());
		assertTrue(emptyTree.isEmpty());
		searchTree.clear();
		assertTrue(searchTree.isEmpty());	
		emptyTree.clear();
		assertTrue(emptyTree.isEmpty());
		emptyTree.add(3);
		emptyTree.add(4);
		emptyTree.add(11111111);
		assertFalse(emptyTree.isEmpty());
		emptyTree.clear();
		assertTrue(emptyTree.isEmpty());
		
	}

}
