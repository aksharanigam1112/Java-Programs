import java.util.*;
class check
{
  String str="";
  int w=0;
  void InputString()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a sentence  :");
      str = sc.nextLine();
    }
 
  private void counter(int n)
  {
      int p ; n=0;
      char ch;
      if( str =="")
        w=0;
      str = str+ " ";
      p = str.indexOf(' ',n);
      ch = str.charAt(n);
      if( ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
         w++;
      counter(p+1);
    }
    
  void display()
  {
      this.counter(7);
      System.out.println(" the given sentence \n " + str);
      System.out.println(" total no of words which begin with a capital vowel are = " +w);
    }

  public void main()
  {
      check obj = new check();
      obj.InputString();
      obj.display();
    }
}
      