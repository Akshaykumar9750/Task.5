import java.util.*;

class Account{
    private String name;
    private int AccNo;
    private double Balance;
    private ArrayList<String> transactionHistory;
    public Account(String name,int AccNo){
        this.name=name;
        this.AccNo=AccNo;
        this.Balance=0.0;
        transactionHistory =new ArrayList();
        transactionHistory.add("Initially Balance"+Balance);
    }
    
        public void deposite(double amount){
            if(amount>0){
            transactionHistory.add("Deposited Balance :"+amount);
            Balance=Balance+amount;
            }
            else
                System.out.println("Enter Valid amount");
        }
        
        public void withdraw(double amount){
            if(amount>Balance){
                System.out.println("Insufficient Balance");
                System.out.println("Current balance is "+Balance);
            }else if(amount<0){
                System.out.println("Enter Valid amount");
            }else{
                transactionHistory.add("Withdraw Amount"+amount);
                Balance=Balance-amount;
            }        
        }
        
        public void transaction(){
            for(String tr:transactionHistory){
                System.out.println(tr);
            }
        }
        
        public void showBalance(){
            System.out.println("Current balance is :"+Balance);
        }
}