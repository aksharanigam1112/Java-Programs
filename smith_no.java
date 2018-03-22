import java.util.*;
class smith_no
{
  int ch;
  private void input()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :-"); 
      ch = sc.nextInt();
      
    }
    
  private int Sum_Of_Digits(int num)
  {
      int rem , sum=0;
      while(num>0)
      {
          rem = num %10;
          sum+=rem;
          num/=10;
        }
        return sum;
    }
    
  private int Prime(int no)
  {
      int i,f=0;
      for(i=1;i<=no ; i++)
      {
          if(no%i==0)
             f++;
            }
            return f;
        }
        
  public void factor()
  {
      input();
      int i,ctr=0,f,t=0,sum,hold=ch;
      sum = Sum_Of_Digits(ch);
      System.out.println("sum= "+sum);
      for(i=2;i<hold;i++)//while(ch>0)
      {
          ctr = Prime(i);
          //i++; 
          if(ctr==2)
          {
              while(ch%i==0)
              {
                  if(i<10)
                    t+=i;
                  else
                    {
                        f=Sum_Of_Digits(i);
                        t+=f;
                    }
                  System.out.println("ch= "+ch+" t= "+t);
                  ch/=i;  
                }
            }
           
        }
        
      if( sum == t)
        System.out.println(" Smith number ");
      else
        System.out.println(" Not a Smith Number ");
    }
   
  
}
            