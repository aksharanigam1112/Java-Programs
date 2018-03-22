import java.util.*;
class FruitJuice
{
   int product_code;
   String flavour;
   String pack_type;
   int pack_size;
   int product_price;
   
   public FruitJuice()
   {
       product_code =0;
       pack_size=0;
       product_price=0;
       flavour ="";
       pack_type= "";
    }
   public void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the product code=");
      product_code = sc.nextInt();
      System.out.println("enter the flavour=");
      flavour = sc.nextLine();
      sc.skip("\t");
      System.out.println();
      System.out.println("enter the pack type=");
      pack_type = sc.nextLine();
      //sc.skip("\n");
      System.out.println("enter the pack size=");
      pack_size =sc.nextInt();
      System.out.println("enter the product price=");
      product_price = sc.nextInt();
    }
    public void discount()
    {
        product_price = product_price - 10;
    }
    public void display()
    {
        System.out.println("the product code ="+"  " +product_code);
        System.out.println("the flavour ="+ "  "+ flavour);
        System.out.println("the pack type ="+"  " +pack_type);
        System.out.println("the pack size ="+"  " +pack_size);
        System.out.println("the product price ="+"  " +product_price);
    }
}