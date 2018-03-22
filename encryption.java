import java.util.*;
class encryption
{
 public static void main()
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size=");
        int n = sc.nextInt();
        sc.skip("\n");
        if( n<1 || n>10)
          {
              System.out.print(" invalid entry");
            }
        else
        {
        int i,j,len,N,r;
        char ch;
        String hold = "";
        String arr[] = new String[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print(" enter a sentence = ");
            arr[i] = sc.nextLine();
        }
        System.out.println("encrypted string is ");
        
        for(i=0;i<n;i++)
        {
            if( (i+1)%2!=0)
            {
                len = arr[i].length();
                for( j=0;j<len;j++)
                {
                    ch = arr[i].charAt(j);
                    if( Character.isLetter(ch))
                    {
                        if(ch=='Z'|| ch=='Y')
                          System.out.print('A');
                        else
                        {
                            System.out.print( (char)(ch+2));
                        }
                    }
                    else
                      System.out.print(ch);
                    }
                }
               
            else
            {
                arr[i] = " " + arr[i];
                r=arr[i].length()-1;
                while( (N = arr[i].lastIndexOf(" ",r))!=-1)
                {
                    hold = arr[i].substring( (N+1) , (r+1));
                    r=N-1;
                    System.out.print(hold + " ");
                }
            }
            System.out.println();
        }
    }
 
 }
}
