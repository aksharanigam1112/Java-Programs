class round_off
{
  public void main()
  {
      double arr[] = {3.52 , 5.96 , 2.9 , 1.06 , 4.28 , 3.13};
      int i,s=0;
      double r ;
      for (i=0;i< arr.length ; i++)
      {
        s = (int)arr[i];
        r = arr[i] -s ;
       if( r>=0.5)
        {
           s++;
         }
      System.out.println(s);
      } 
    }
}
          