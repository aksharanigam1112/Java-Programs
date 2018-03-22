import java.util.*;
class data
{
  protected String str;
  
  data()
  {
      str=" ";
    }
    
  public void acceptstr()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentance:-");
      str = sc.nextLine();
    }
    
  public void print()
  {
      System.out.println("\t\n Given Sentance =");
      System.out.println("\n\t\""+str+"\"");
    }
}
