import java.util.*;


public class   LinkedHasMapCheck {
    public static void main(String[] args){


    LinkedHashMap<Integer,String> myLinkedHashMap = new LinkedHashMap<Integer, String>();

        myLinkedHashMap.put(1,"sravan");
        myLinkedHashMap.put(2,"kumar");
        myLinkedHashMap.put(3, "hii");
        myLinkedHashMap.put(27,"bye");

       


      for( Map.Entry mystudent : myLinkedHashMap.entrySet())  {

            System.out.println(mystudent.getKey()+" "+mystudent.getValue());
        }
    }
}

    

