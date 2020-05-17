package pr2.pu3;

/**
 * Ein Knoten einer verketteten Liste, der beliebige Elemente
 * aufnehmen kann.
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class ListNode<E>  {
  /**
   * Wert, den dieser Knoten aufnimmt.
   */
  public E value;

  /**
   * Nachfolger dieses Knotens. null bedeutet: kein Nachfolger.
   */
  public ListNode<E> next = null;

  // Konstruktoren

  /**
   * Erzeugt einen neuen Knoten.
   *
   * @param value Wert dieses Knotens
   * @param n     Nachfolger-Knoten
   */
  public ListNode(E value, ListNode<E> n) {
    this.value = value;
    next = n;
  }


  /**
   * Erzeugt einen neuen Knoten (neue Liste).
   *
   * @param value int-Wert dieses Knotens
   */
  public ListNode(E value) {
    this.value = value;
  }

  /**
   * @return Den Wert des ersten Knotens der Liste.
   */
  public E getHead() {
    return value;
  }

  /**
   * @return Die Restliste.
   */
  public ListNode<E>  getTail() {
    return next;
  }

  /**
   * Erzeugt einen neuen Listenknoten und l√§sst ihn auf diese
   * Liste zeigen.
   *
   * @param value Wert des neuen Listenknotens.
   * @return Die neue Liste mit neuem Knoten am Anfang.
   */
  public ListNode<E> addFirst(E value) {
    return new ListNode<>(value, this);
  }


  /**
   * @return Die Anzahl der Elemente in der Liste.
   */
  public int size() {
    if (getTail() == null) { // Kein Nachfolger-Knoten vorhanden?
      return 1; // Liste hat genau ein Element.
    } else {
      return 1 + getTail().size();
    }
  }

  /**
   * Gibt das Element auf die Console aus (ohne Zeilenumbruch).
   */
  public void print() {
    System.out.print(value + " ");
  }

  public String toString() {
    return value + "";
  }
  
  /**
   * @param rueckgabe 		String der den Inhalt der Liste enth‰lt
   * @param helpNode		zur Zwischenspeicherung der restlichen Nodes
   * @return				fertiger String rueckgabe
   */
  public String toListString() {
    String rueckgabe = toString();
    ListNode<E> helpNode = this.getTail();
    for(int i = 0; i < size()-1 ; i++){
      rueckgabe += ", " + helpNode.value.toString();
      helpNode = helpNode.getTail();
    }
    return "(" + rueckgabe + ")";
  }

  /**
   * ermittelt iterativ ob die Liste einen bestimmten Wert enth‰lt
   * @param helpNode 		zur Zwischenspeicherung des aktuellen Node
   * @return				gibt true zur¸ck wenn Wert enthalten, false wenn nicht
   */
  public boolean containsIter(E e) {
    ListNode<E> helpNode = this;
    for(int i = 0; i < size() ; i++){
      if(helpNode.getHead() == e){ 
        return true;
      }
      helpNode = helpNode.getTail();
    }    
    return false;
  }

  /**
   * ermittelt rekursiv ob die Liste einen bestimmten Wert enth‰lt
   * @return				gibt true zur¸ck wenn Wert enthalten, false wenn nicht
   */
  public boolean contains(E e) {
    if(this.getHead() == e){
      return true;
    } else if(getTail() != null) {
      if(this.getTail().contains(e)) 
        return true;
    }
    return false;
    
  } 
}
