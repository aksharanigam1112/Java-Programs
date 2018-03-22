import java.io.*;
class date
{
public void cal()throws IOException
{
int y,m,dd;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter number ");
int d= Integer.parseInt(br.readLine());
int arr[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
String st[]={" "," jan","feb","march","april","may","june","july","aug","sep","oct","nov","december"};
y=d%100;
d=d/100;
m=d%100;
d=d/100;
dd=d;
String p;
    if(m>=1&&m<=12)  
    {
       if(dd>=1&&dd<=arr[m])
       {
        if(dd==1||dd==21||dd==31)
           p="st";
        else
            if(dd==2||dd==22)
               p="nd";
            if(d==3||d==23)
                 p="rd";
              else
             p="th";
           System.out.println(dd+p+" "+st[m]+" "+y);
           System.out.println("valid");
       }
      else
         System.out.println("invalid");
  }
    else
        System.out.println("invalid");
}
}
