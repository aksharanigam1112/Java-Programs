
import java.util.*;

class time
{
 int hh,mm;
 public void accept()
 {
  
  Scanner sc =new Scanner(System.in);
  System.out.print("\n enter minutes ");
  mm=sc.nextInt();
  System.out.print("\n enter hours ");
  hh=sc.nextInt();
  
}
public int totalmin()
{
  int t= (hh*60)+mm;
  return t;
}
public void mintotime(int min)
{
  hh=min/60;
  mm=min%60;
}
public time diff(time obj)
{
int c;
 time ob= new time();
    int a= obj.totalmin();
      int b= this.totalmin();
      if(b>a)
      c=b-a;
      else
      c=a-b;
      ob.mintotime(c);
      return ob;
    }
    public void show()
    {
      System.out.println("hours= "+hh);
      System.out.println("minutes= "+mm);
    }
    
   /*public static void main()
   {
     time ob1=new time();
     time ob2=new time();
     time ob3=new time();
     ob1.accept();
     ob2.accept();
    System.out.println("show value of object one");   
    ob1.show();
        System.out.println("show value of object two");
      ob2.show();
      ob3=ob2.diff(ob1);
     System.out.println("show value of diffrent object ");
     ob3.show();
    }*/
}
