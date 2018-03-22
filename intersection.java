class intersection
{
 public static void main()
 {
     int A [] = { 2,5,6,-1,11,4,3};
     int B [] = {3,11,2,1,6,7,8,5};
     int x[]=new int[20];
     int i,j,la=A.length,lb,c=0,k=0,t;
     
    lb=B.length; 
    System.out.println("\n A union  ");
    for(i=0;i<la;i++)
     System.out.print(A[i]+"   ");
     System.out.println("\n B union  ");
    for(i=0;i<lb;i++)
     System.out.print(B[i]+"   ");
    //union
  k=0;  
  for(i=0;i<lb;i++)
  {
       c=0;
     for(j=0;j<la;j++)
     {
          if(B[i]==A[j])
            c++;
        }
      if(c>0)
      {
       x[k]=B[i];
        k++;
      }  
    }
   System.out.println("\n union  ");
    for(i=0;i<k;i++)
      System.out.print(x[i]+"   ");
    
    }
}
