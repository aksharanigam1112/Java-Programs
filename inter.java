class inter
{
 public void main()
 {
     int a [] ={12,18,37,65,65,65,78};
     int b[] ={5,9,11,12,65,80};
     int c[] = new int [10];
     
     int i,j,f,l=0;
     for(i=0;i<a.length;i++)
     {
         f=-1;
         if(i>0&&a[i]==a[i-1])
             continue;
         for(j=0;j<b.length;j++)
         {
             if(a[i]==b[j])
             {
                 f=j;
                 break;
                }
            }
         if( f!=-1)
         {
             c[l] =a[i];
             l++;
            }
        }
        
     for( i=0;i<c.length;i++)
     {
         System.out.println(c[l]);
        }
       
    }
}