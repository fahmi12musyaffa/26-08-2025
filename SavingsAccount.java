public class SavingsAccount {
    public double balance ;
    public double interestRate = 0.01;
    public String name;

   
    public void deposit(int x){
       balance += x;

    }//end method deposit

    public double calcInterest(){
        return balance * interestRate;
    }
    public void displayCustomer (){
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println();
    }//end method displayCustomer 
}//end class SavingsAccount

