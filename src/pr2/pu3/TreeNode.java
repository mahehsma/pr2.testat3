package pr2.pu3;

/**
 * Ein Knoten für einen Binärbaum. Dieser Knoten kann selbst als eigener
 * Binärbaum aufgefasst werden.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class TreeNode<E> {

	protected E value = null; // Wert des Knotens.
	protected TreeNode<E> left = null; // Linker Teilbaum.
	protected TreeNode<E> right = null; // Rechter Teilbaum.

	/**
	 * Erzeuge einen neuen Binärbaum-Knoten. Nachfolger und Vorgänger sind nicht
	 * gesetzt.
	 *
	 * @param v Der Wert des Knotens.
	 */
	public TreeNode(E v) {
		value = v;
		left = right = null;
	}

	/**
	 * Erzeuge einen neuen Binärbaum(-Knoten), entspricht tree().
	 * 
	 * @param value Der Wert des Knotens.
	 * @param left  Der linke Teilbaum.
	 * @param right Der rechte Teilbaum.
	 */
	public TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public E getValue() {
		return value;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	/**
	 * Bestimme die Höhe des Baums.
	 *
	 * @return 		gibt Hoehe des Baums als Integer zur�ck
	 */
	public int height() {

		return height(this);
	}
	
	/**
	 * Bestimmt die Hoehe des Baums
	 * @param n 	aktueller Node
	 * @return		gibt Hoehe des Baums als Integer zur�ck
	 */
	public int height(TreeNode<E> n) {
		if (n == null)
			return 0;
		int r = height(n.getRight());	//ermittelt rekursiv die Hoehe des rechten Teilbaums
		int l = height(n.getLeft());	//ermittelr rekursiv die Hoehe des linken Teilbaums
		if (r < l)						//gibt das Maximum +1 zur�ck
			return l + 1;
		else
			return r + 1;
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @return
	 */
	public int size() {
		return size(this);
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @param node Wurzelknoten eines (Teil-)Baums.
	 * @return
	 */
	private int size(TreeNode<E> node) {
		if (node == null) { // Leerer Baum?
			return 0; // Anzahl Elemente ist 0.
		} else { // Echter Teilbaum.
			// Größe ist dieser Knoten plus solche in den Teilbäumen:
			int sizeLeft = size(node.getLeft());
			int sizeRight = size(node.getRight());
			return 1 + sizeLeft + sizeRight;
		}
	}

	public String toString() {
		return value + " ";
	}

	/**
	 * Gibt den Baum ab dem Wurzelknoten in Inorder-Reihenfolge auf die Konsole aus.
	 */
	public void printInorder() {
		printInorder(this);
		System.out.println(); // Am Ende noch eine neue Zeile.
	}

	/**
	 * Durchläuft einen (Teil-)Baum vom Wurzelknoten an in Inorder-Reihenfolge und
	 * gibt die Werte auf die Konsole aus.
	 *
	 * @param node Wurzelknoten des (Teil-)Baums
	 */
	private void printInorder(TreeNode<E> node) {
		if (node != null) { // Ist der Baum nicht leer?
			// Dann kann weiter gemacht werden.
			printInorder(node.getLeft());
			System.out.println(node.toString());
			printInorder(node.getRight());
		}
	}

	/**
	 * vergleicht zwei B�ume miteinander und �berpr�ft ob sie identisch sind
	 * @param otherNode		Baum mit dem verglichen werden soll
	 * @return				gibt true zur�ck falls B�ume identisch, false wenn nicht
	 */
	public boolean equalStructure(TreeNode<E> otherNode) {
		if (this.getValue() != otherNode.getValue()) { //�berpr�ft aktuellen Knoten auf Gleichheit
			return false;
		}
		if (this.getLeft() != null) {
			if (otherNode.getLeft() == null)
				return false;
			if (!this.getLeft().equalStructure(otherNode.getLeft())) {//�berpr�ft rekursiv linken Teilbaum auf Gleichheit
				return false;
			}
		} else if (otherNode.getLeft() != null)
			return false;
		if (this.getRight() != null) {
			if (otherNode.getRight() == null)
				return false;
			if (!this.getRight().equalStructure(otherNode.getRight())) {//�berpr�ft rekursiv rechten Teilbaum auf Gleichheit
				return false;
			}
		} else if (otherNode.getRight() != null)
			return false;
		return true;	
	}

}
