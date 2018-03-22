class pascal_tri
{
  public void cal()
  {
int i, j, arr[]= new int[7];
		arr[0]=1;
		for(i=0;i<6;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(arr[j]+"\t");
			
			for(j=i+1;j>0;j--)
				arr[j]=arr[j]+arr[j-1];
			System.out.println();
		}
}
}
