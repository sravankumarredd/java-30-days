import java.util.*;



public class LinkedListCheck {
    public static void main (String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("hii");
        myLinkedList.add("nill");
        myLinkedList.add("end");
        
        myLinkedList.remove(1);
        Iterator iterator = myLinkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
