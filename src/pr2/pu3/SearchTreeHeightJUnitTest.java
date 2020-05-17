package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTreeHeightJUnitTest {

	@Test
	void test() {
		SearchTree<Integer> searchTree = new SearchTree<>();
		assertEquals(0,searchTree.height());
		searchTree.add(4);
		assertEquals(1,searchTree.height());
		searchTree.add(3);
		assertEquals(2,searchTree.height());
		searchTree.add(5);
		assertEquals(2,searchTree.height());
		searchTree.add(6);
		assertEquals(3,searchTree.height());
		searchTree.add(7);
		assertEquals(4,searchTree.height());
		assertFalse(searchTree.height() == 3);
		searchTree.clear();
		assertEquals(0, searchTree.height());
		
		
	}

}
