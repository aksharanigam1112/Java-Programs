class cyclic_shift
{
  public static void main()
  {
      int arr[][] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};
      int hold =0,i,j,m;
      System.out.println("\t  Given array ");
      
      for(i=0;i<arr.length;i++)
      {
          for(j=0;j<arr[0].length;j++)
          {
              System.out.print(arr[i][j]+"  ");
            }
          System.out.println();
        }
        
      for(i=0;i<arr.length-1;i++)
      {
          m=i+1;
          for(j=0;j<arr[0].length;j++)
          {
              hold = arr[i][j];
              arr[i][j] = arr[m][j];
              arr[m][j]=hold;
            }
        }
        
      System.out.println("\t  Shifted array ");
      
      for(i=0;i<arr.length;i++)
      {
          for(j=0;j<arr[0].length;j++)
          {
              System.out.print(arr[i][j]+"  ");
            }
          System.out.println();
        }
    }
}