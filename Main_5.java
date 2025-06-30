
import java.util.*;

public class Main_5{
   public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Account holder name :");
      String name=sc.nextLine();
      System.out.print("Enter Account number of 10 number :");
      int AccNo=sc.nextInt();
      Account ac=new Account(name,AccNo);
      
      while(true){
      System.out.println("--------Account Holder want ?--------");
      System.out.println("1 Deposite amount ");
      System.out.println("2 Withdraw amount ");
      System.out.println("3 Show Transaction history ");
      System.out.println("4 Show Balance ");
      System.out.println("5 Exit");
      
      System.out.print("Enter your choice :");
      int choice=sc.nextInt();
      
      switch(choice){
          case 1:
          {
              System.out.print("Enter Amount to deposite :");
              double amm=sc.nextDouble();
              ac.deposite(amm);
              break;
          }
              
          case 2:
          {
              System.out.print("Enter withdraw Amount ");
              double amm=sc.nextDouble();
              ac.withdraw(amm);
              break;
          }
          
          case 3:
          {
              ac.transaction();
              break;
          }
          
          case 4:
          {
              ac.showBalance();
              break ;
          }
          
          case 5:
          {
              System.exit(0);
          }
          
          default :
              System.out.println("Invalid choice, Please choouse correct choice :");   
      }
      }
   }
}
