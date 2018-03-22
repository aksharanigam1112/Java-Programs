import java.util.*;
class movieMagic
{
  int year;
  String title;
  float rating;
  public movieMagic()
  {
      year=0;
      title="";
    }
  public void accept()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the year=");
      year = sc.nextInt();
      sc.skip("\n");
      System.out.println("enter the movie name=");
      title = sc.nextLine();
  
      System.out.println("enter the movie ratings=");
      rating = sc.nextFloat();
    }
  public void display()
  {
      System.out.println(" Movie Title="+" \t"+ title);
      if( rating >=0.0 && rating<=2.0)
         System.out.println(" Movie Rating="+"  "+ rating+ "\t" + "FLOP");
      else
        if(rating>=2.1 && rating<=3.4)
        System.out.println(" Movie Rating="+"  "+ rating+ "\t" + "SEMI-HIT");
        else
           if(rating>=3.5 && rating<=4.5)
             System.out.println(" Movie Rating="+"  "+ rating+ "\t" + "HIT");
           else
             if(rating>=4.6 && rating<=5)
                System.out.println(" Movie Rating="+"  "+ rating+ "\t" + "SUPER HIT");
            }
            
        }
        