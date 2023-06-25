import java.util.*;

class Employee{
    int Employee_id;
    String pan_id;
    String name;
     
    public Employee(int Employee_id, String pan_id, String name ){

        this.Employee_id=Employee_id;
        this.pan_id = pan_id;
        this.name=name;
    }
}

public class ClassList {
    public static void main (String[] args){
    
LinkedList<Employee> employeelist = new LinkedList<Employee>();

Employee sravan = new Employee(1, "abs1222","sravan" );
Employee kumar = new Employee(2, "282892jsh","kumar");

 employeelist.add(sravan);
 employeelist.add(kumar);

   Iterator iterator = employeelist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().);
}
}
}
