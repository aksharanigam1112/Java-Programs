import java.util.*;
class cq
{
  Scanner sc = new Scanner(System.in);
  private int menu()
  {
      System.out.println("\t MENU  \t");
      System.out.println("1...... Insert an element");
      System.out.println("2...... Remove an element");
      System.out.println("3...... exit");
      System.out.println("enter your choice");
      int n =  sc.nextInt();
      sc.skip("\n");
      return n;
    }
    
  public void main()
  {
      circular_queue names = new circular_queue();
      int ch;
      String temp = "";
      do
      {
          ch = menu();
          switch(ch)
          {
              case 1 :
                   System.out.println("enter the name=");
                   temp = sc.nextLine();
                   names.insert(temp);
                   break;
                   
              case 2 :
                   temp = names.remove();
                   if(temp!=null)
                     System.out.println("Removed name = " +temp);
                     break;
                    }
                }while(ch!=3);
            }
        }