
public class BankAccount {
    
   
    String AccountType;

   
    double balance;


    
    Customer customer;


    public BankAccount(String AccountType, Customer customer){
        this.AccountType = AccountType;
        this.customer = customer;
    }

    
    public void deposit(double amount){
       this.balance = this.balance + amount;
        
    }

    public void withdraw(double amount){
        if(this.balance > amount){
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Balance is less than the given amount ");
        }
    }

    public String getAccountInfo(){
        return this.AccountType + " " + this.balance;
    }

    
    public String getCustomerInfo(){
        return this.customer.name + " " +this.customer.address +" "+ this.customer.age;
    }

    public double getInterestPayment(double amount, double rate_of_interest, int time_in_years){
        double interest = (amount * rate_of_interest * time_in_years)/100;
        return interest;
    }

}
