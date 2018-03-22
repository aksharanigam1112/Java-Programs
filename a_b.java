class a_b
{
 public static void main()
 {
     int A[] = { 12,18,37,65,65,78};
     int B[] = {5,9,11,12,65,80};
     int C[] = new int [7];
     
     int i,j,f,l=0;
     for(i=0 ;i<A.length;i++)
     {
         f=-1;
         for(j=0;j<B.length;j++)
         {
             if(A[i] ==B[j])
             {
                f=j;
                break;
            }
        }
        if( f==-1)
        {
            C[l] = A[i];
            l++;
        }
    }
    for(i=0;i<C.length;i++)
        System.out.println(C[i]);
    }
}