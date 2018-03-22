import java.util.*;
class bank
{
  
  private int input()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter an amount upto five digits =");
      int amt = sc.nextInt();
      return amt;
    }
    
  private String break_amt(int n)
  {
      String s = "";
      String arr[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
      int rem;
      while (n>0)
      {
          rem = n%10;
          n = n/10;
          s = arr[rem]+"   "+s;
          
        }
      return s;
    }
    
  private void denom(int num)
  {
      int t=0,p=num,r,i=0;
      int rs[] = {2000,500,100,50,20,10,5,2,1};
      
      while(p>0)
      {
          if(p>=rs[i])
          {
              r=p/rs[i];
              p=p%rs[i];
              System.out.println(rs[i]+ "  *  "+r+"  =  "+(rs[i]*r));
              t+=r;
            }
              i++;
            }
      System.out.println(" TOTAL AMOUNT ="+num);
      System.out.println("Total no of notes ="+t);
    }
    
  public void main()
   {
      int money = input();
      String ans = break_amt(money);
      System.out.println("Amount in words is = \n" + ans );
      denom(money);
    }
}

        