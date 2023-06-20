import java.util.Scanner;
/**
 * Represents a bank for managing customers and thier bank accounts
 */
public class bank {
    
    /**
     * Main method which is used for running the project or starting point of the code execution.
     * @param args default for printing output to the screen
     */
    public static void main(String[] args){

        /**
         * mybank is an object for creating a bank
         */
        bank mybank = new bank();

        mybank.open();
        //Welcome message
        System.out.println("Welcome to the bank");

        Scanner sc = new Scanner(System.in);

        // Takes the name of the customer from user
        System.out.println("Enter the name of the Customer");
        String name = sc.nextLine();

        // Creates the customer with given name
        Customer c1 = new Customer(name);

        // Greeting message
        System.out.println("We are creating a current and savings account for you :)");

        // Taking address of customer from the user
        System.out.println("What is your address ?");
        String address = sc.nextLine();

       // Sets the address to the customer
        c1.setAddress(address);

        // Taking age input from the user
        System.out.println("Alright ! What is your age ?");
        int age = sc.nextInt();

        // Sets the age to the customer
        c1.setAge(age);

        BankAccount savingsAccount = new BankAccount("savings", c1);
        BankAccount currentAccount = new BankAccount("current", c1);

        System.out.println();

        System.out.println("Customer Information is " + savingsAccount.getCustomerInfo());
        System.out.println("Account Information is " + savingsAccount.getAccountInfo());

        System.out.println("Mr ." + savingsAccount.customer.name );
        System.out.println("How much would like to deposit ?");

        double depositAmount  = sc.nextDouble();
        savingsAccount.deposit(depositAmount);

        System.out.println("Account Information is " + savingsAccount.getAccountInfo());

        System.out.println("Mr ." + savingsAccount.customer.name );
        System.out.println("How much would like to withdraw ?");

        double withdrawAmount = sc.nextDouble();
        savingsAccount.withdraw(withdrawAmount);

        System.out.println("Account Information is " + savingsAccount.getAccountInfo());

        
        mybank.close();
        
    }

    /**
     * Denotes the running status of the bank
     */
    public void open(){
        System.out.println("Our bank is opened");
    }


    /**
     * Denotes the running status of the bank
     */
    public void close(){
        System.out.println("Our bank is closed");
    }
}