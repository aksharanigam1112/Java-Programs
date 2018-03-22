import java.util.*;
class sort_length
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Enter a sentence:-  ");
      String hold = sc.nextLine();
      StringTokenizer obj = new StringTokenizer(hold);
      String arr[] = new String[obj.countTokens()];
      int i,j,p,r=0,k;
      String str;
      for(i=0;i<arr.length;i++)
      {
          arr[i] = obj.nextToken();
        }
        
      for(i=0;i<arr.length-1;i++)
      {
          str=arr[i];
          p=i;
          for(j=i+1;j<arr.length;j++)
          {
              
              if(str.length()>arr[j].length())
              {
                  str = arr[j];
                  p=j;
                }
              
            }
          for(k=p;k>r;k--)
          {
              arr[k] = arr[k-1];
            }
          arr[i]=str;
          r++;
        }
      System.out.println(" Sorted array :-");
      for(i=0;i<arr.length;i++)
      {
          System.out.print(arr[i] + "    ");
        }
    }
}
        
        
      