class rotate
{
  public static void main()
  {
      int arr[][] = {{1,2,3,4},{7,8,6,9},{5,3,2,1},{11,12,5,6}};
      //int n = arr.length , p=n , k=0,
      int i,j;
      //int a[] = new int [n*n];
      System.out.println(" given ");
      for(i=0 ; i<arr.length ; i++)
      {
          for(j = 0 ;j<arr.length ; j++)
          {
              System.out.print(arr[i][j]+"\t");
            }
          System.out.println();
        }
      /* k=0;
       i=0;
       j=0;
      while(k<p*p)
      {
          for( ; j<n ;j++)
            a[k++] = arr[i][j];
          j--;
          i++;
          for( ; i<n ; i++)
            a[k++] = arr[i][j];
          i--;
          j--;
          for( ; j>=p-n ; j--)
            a[k++] = arr[i][j];
          j++;
          i--;
          n--;
          for( ;i>=p-n;i--)
          a[k++]=arr[i][j];
          i++;
          j++;
        }
        
      k=0;
      i=0;
      j=p-1;
      n=p;
      
      //while(k<p*p)
      //{
          for( ; i<n ;i++)
            arr[i][j] = a[k++];
          j--;
          i--;
          for( ; j>=p-n ; j--)
            arr[i][j] = a[k++];
          i--;
          j++;
          
          for(  ; i>=p-n ; i--)
            arr[i][j] = a[k++];
          j++;
          i++;
          n--;
          for(  ; j<=p-n+1 ; j++)
            arr[i][j] = a[k++];
          i++;
          j++;
        //}*/
        
        
        
       int k = arr.length - 1;
       int a[] = new int [arr.length];
       int m,n;
       for ( m=0  ; m<arr.length ; m++)
           a[m] = arr[0][m];
       for(m=0 ; m<arr.length ; m++)
          arr[0][m] = arr[k--][0];
        k = arr.length -1 ;
        n=k;
        for( m = arr.length-1; m>0 ; m--)
            arr[m][0] = arr[k][m];
       for( m = 0 ; m<arr.length ; m++)
           arr[k][m] = arr[n--][k];
       for( m=0 ; m<arr.length ; m++)
           arr[m][k] = a[m];
           
           
       System.out.println(" Modify matrix ");
      for(i=0 ; i<arr.length ; i++)
      {
          for(j = 0 ;j<arr.length; j++)
          {
              System.out.print(arr[i][j]+ "\t");
            }
          System.out.println();
        }
       
    }
}
            