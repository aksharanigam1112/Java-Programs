import java.util.*;
class pattern5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size = ");
        int n = sc.nextInt();
        System.out.print(" Enter 1st character = ");
        char ch1 = sc.next().charAt(0);//Line().charAt(0);
        System.out.print(" Enter 2nd character = ");
        char ch2 = sc.next().charAt(0);
        System.out.print(" Enter 3rd character = ");
        char ch3 = sc.next().charAt(0);
       
        
        char arr[][] = new char[n][n];
        int i,j;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if( (i == j) || (i+j == n-1) )
                   arr[i][j] = ch3;
                else
                {
                    if( (i<j && i+j<n) || (i>j && i+j>=n))
                       arr[i][j] = ch1;
                       
                    if( (i>j && i+j<n) || (i<j && i+j>=n))
                      arr[i][j] = ch2;
                    }
                }
            }
            
        System.out.println(" PATTERN ");
        
        for(i=0 ; i<n ; i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print( arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}