import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class operators{

    public static void main (String[]  args){

        Scanner sc = new  Scanner(System.in);
         
        System.out.print("enter my first integer");

        int myInt1 = sc.nextInt();
         
        System.out.print("enter my second integer");

        int myInt2 = sc.nextInt();

       boolean  Result = myInt1 <= myInt2;
        System.out.println(" The result is " + Result);

    }
}

