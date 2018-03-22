import java.util.*;
class store
{
 public void cal()
 {
     Scanner sc = new Scanner (System.in);
     String name[] = new String [3];
     int marks[] = new int [3];
     int k,ctr = 1;
     System.out.println(" Sno. \t NAME \t Marks");
     for ( k = 0 ; k < 3 ; k++)
     {
         System.out.println( " student name :-");
         name[k] = sc.nextLine();
         System.out.println( " student marks :-");
         marks[k] = sc.nextInt();
         if ( marks[k]>= 90)
         {
             System.out.print(ctr + "\t" + name [k]);
             System.out.println("\t" + marks [k]);
             ctr++;
            }
        }
    }
}