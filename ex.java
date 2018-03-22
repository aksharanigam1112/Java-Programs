
class ex
{
public void cal()
{
int c=0;
System.out.println("i\tj\tk\tc");
for(int i=0;i<3;i++)
  re:
   for(int j=0;j<4;j++)
     for(int k=0;k<5;k++)
     { System.out.println(i+"\t"+j+"\t"+k+"\t"+c);
         ++c;
         if(i==1&&j==2&&k==3)
         break re;
        }
        System.out.println(c);
    }
}