import java.util.*;
class tech
{
 String Arr[] = new String [ 5];
 String sr;
 public void accept()
 {
     Scanner sc = new Scanner (System.in);
     int i;
     
     for( i=0;i<5;i++)
     {
         System.out.println("enter Student's name =");
         Arr[i] = sc.nextLine();
        }
      System.out.println("enter Student's name to be searched =");
      sr = sc.nextLine();
    }
  public void Alsort()
  {
     int p , k , i;
     String temp = "";
     for(p=1;p<Arr.length;p++)
     {
         for( k=0;k<Arr.length-p;k++)
         {
           if(Arr[k].compareTo(Arr[k+1])>0)
           {
               temp = Arr[k];
               Arr[k] = Arr[k+1];
               Arr[k+1] = temp;
            }
        }
    }
    System.out.println("sorted array ");
    for(i=0;i<Arr.length;i++)
    {
        System.out.println(Arr[i]);
    }
 }
 public int Binary_Search()
 {
     int b=0,e,m=-1,n = -1;
     e =Arr.length-1;
     while( b<=e)
     {
         m = (b+e)/2;
         n = sr.compareTo(Arr[m]);
         if(n ==0)
          break;
         if ( n>0)
          b = m+1;
         else
          e = m-1;
        }
     if(b>e)
      return -1;
     else
       return m;
    }
}