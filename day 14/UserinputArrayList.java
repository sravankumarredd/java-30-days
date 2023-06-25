import java.util.*;




public class UserinputArrayList {
    public static void main(String[] args){

        System.out.println("enter numbers of Integers");
         
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        for ( int i = 0; i<n; i++){
            System.out.println("enter no of element");
            int element = sc.nextInt();
             scores.add(element);
        }
             Iterator iterator = scores.iterator();
             
             while(iterator.hasNext()){
                System.out.println(iterator.next()+"");
             }
            
        }
    }    

