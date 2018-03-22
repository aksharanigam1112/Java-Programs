import java.util.*;
class angle
{
  int deg,min;
  
  angle()
  {
      deg=min=0;
    }
    
  public void inputangle()
  {
      Scanner sc = new Scanner( System.in);
      System.out.println("Enter the degree= ");
      deg  = sc.nextInt();
      System.out.println("Enter the minutes= ");
      min  = sc.nextInt();
    }
    
  public void dispangle()
  {
      System.out.println("\t\n Angle:- " + deg +" degrees " + min+ " minutes");
    }
    
  public angle sumOfAngle( angle t1 , angle t2)
  {
      int d=0,m=0;
      angle obj = new angle();
      d = t1.deg+t2.deg;
      m = t1.min+t2.min;
      
      if(m>60)
      {
          m = m-60;
          d++;
        }
      obj.deg = d;
      obj.min = m;
      return obj;
    }
    
}
