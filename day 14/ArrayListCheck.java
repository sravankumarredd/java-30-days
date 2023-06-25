import java.util.*;
 
 public class ArrayListCheck{
      
       public static void main (String[] args) {
          /* code */
           ArrayList<String> myArraylist = new ArrayList<String>();
            myArraylist.add("hello");
            myArraylist.add("bye");
            myArraylist.add("hii");
            myArraylist.remove(2);
            Iterator iterator = myArraylist.iterator();
             
             while(iterator.hasNext()){
                 System.out.println(iterator.next());
             }
            
      }
 }
