import java.util.*;
class abc
{
 public void cal()
 {
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the length of array a");
     int L1 = sc.nextInt();
     int A [] = new int [L1];
     System.out.println("enter the length of array b");
     int L2 = sc.nextInt();
     int B [] = new int [L2];
     int L3 = L1 + L2;
     int C [] = new int [L3];
     int i,p=0;
     for (i = 0 ; i < L1 ; i++)
     {
        System.out.print("\n enter the value for of array a"); 
        A[i] = sc.nextInt();
    }
    for( i=0;i<L2;i++)
    {
       System.out.print("\n enter the value for of array b"); 
        B[i] = sc.nextInt(); 
    }
    for(i = 0; i<L1;i++)
      C[i]= A[i];
     
    for(i=L1; i<L3;i++)
    {
        
        C[i] = B[p];
        p++;
    }
    for(i=0; i<L3 ;i++)
      System.out.println(C[i]);
  }
}