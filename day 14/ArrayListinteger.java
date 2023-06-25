import java.util.*;
public class ArrayListinteger { 
     

    public static void main(String[] args) {
        
        ArrayList<Integer> myIntegers = new ArrayList<Integer>();
         ArrayList<Integer>yourinteger=new ArrayList<Integer>();

         yourinteger.add(398);
         yourinteger.add(38);
         yourinteger.add(2783);
        myIntegers.add(10);
        
        myIntegers.add(20);
        
        myIntegers.add(30);

        myIntegers.addAll(0,yourinteger);
         
        myIntegers.add(1,100);
        
        myIntegers.remove(3);
         

    System.out.println(myIntegers.contains(10));
            Iterator iterator = myIntegers.iterator();
            
         while(iterator.hasNext()){
            System.out.println(iterator.next());
         }

            System.out.println("my elements are printed");
        }
    }