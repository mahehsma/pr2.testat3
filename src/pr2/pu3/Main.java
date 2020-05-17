package pr2.pu3;

public class Main {
    public static void main(String[] args) {
    	
    	//neue Liste vom Typ Integer
       ListNode<Integer> list = new ListNode<>(8);
       list = list.addFirst(5);
       list = list.addFirst(3);
       list = list.addFirst(2); 
       list = list.addFirst(1);
       list = list.addFirst(1);
   
       System.out.println(list.toListString());
       
       //neue Liste vom Typ String
       ListNode<String> stringList = new ListNode<>("schön");
       stringList = stringList.addFirst("ist");
       stringList = stringList.addFirst("Wetter");
       stringList = stringList.addFirst("das");
       stringList = stringList.addFirst("Welt");
       stringList = stringList.addFirst("Hallo");

       System.out.println(stringList.toListString());
  
    }


    
    
}

