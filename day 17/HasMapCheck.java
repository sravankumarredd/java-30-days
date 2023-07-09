import java.util.*;

public class HasMapCheck {

    public static void main(String[] args){

        HashMap<Integer,String> myHashMap = new HashMap<Integer, String>();

        myHashMap.put(1,"sravan");
        myHashMap.put(2,"kumar");
        myHashMap.put(3, "hii");
        myHashMap.put(27,"bye");

        myHashMap.remove(1,"sravan" );


      for( Map.Entry mypair : myHashMap.entrySet())  {

            System.out.println(mypair.getKey()+" "+mypair.getValue());
        }
    }
}
