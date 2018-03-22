import java.util.*;
class angle_app
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      angle a = new angle();
      angle b = new angle();
      angle c = new angle();
      //angle d = new angle();
      
      System.out.println("\n Enter the first angle:-");
      a.inputangle();
      System.out.println("First angle : ");
      a.dispangle();
      
      System.out.println("\n Enter the second angle:-");
      b.inputangle(); 
      System.out.println("Second angle : ");
      b.dispangle();
      
      c = c.sumOfAngle(a,b);
      System.out.println("THE SUM OF THE ANGLES IS");
      c.dispangle();
    }
}