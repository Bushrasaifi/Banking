
public class bank1 
{
  private String name;
  private static int a=1002;
  private int acc;
  public int balance;
  
 public  void open(String s,int Amount)
   {
      this.name=s;
      this.balance=Amount;
     this.acc=a++;
       
      
   }
  public int withdraw(int d)
   {
     return balance-=d;
   }
 public  int deposit(int d)
   {
    return balance+=d;   
   }
 public  int getAcc()
   {
   return acc;
   }
   
    
    }      

