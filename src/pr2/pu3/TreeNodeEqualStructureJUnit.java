package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeEqualStructureJUnit {

	@Test
	void test() {
		TreeNode<Integer> tree0 = new TreeNode<>(1,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));
		TreeNode<Integer> tree1 = new TreeNode<>(1,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));
		TreeNode<Integer> tree2 = new TreeNode<>(2,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));
		TreeNode<Integer> tree3 = new TreeNode<>(1,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(8)));
		TreeNode<Integer> tree4 = new TreeNode<>(1,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(7), new TreeNode<>(6)));
		TreeNode<Integer> tree5 = new TreeNode<>(null);
		TreeNode<Integer> tree6 = new TreeNode<>(1,new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5)),new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7, new TreeNode<>(8), null)));
		
		assertTrue(tree0.equalStructure(tree0));
		assertTrue(tree0.equalStructure(tree1));
		assertFalse(tree0.equalStructure(tree2));
		assertFalse(tree0.equalStructure(tree3));
		assertFalse(tree0.equalStructure(tree4));
		assertTrue(tree5.equalStructure(tree5));
		assertFalse(tree5.equalStructure(tree0));
		assertFalse(tree6.equalStructure(tree0));
		assertFalse(tree0.equalStructure(tree6));
	}

}
