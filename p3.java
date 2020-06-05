import java.util.Scanner;
class p3
{
   public static void main(String[] args)
   {
      int n1=0,n2=0;
      System.out.println("Enter the value of c1 and c2");
      Scanner sc=new Scanner(System.in);
      int c1=sc.nextInt();
      int c2=sc.nextInt();
      for(int n=0;n<10;n++)
      {
         System.out.println("f(n)  "+(7*n*n+n+5)+"    c1*g(n)    "+(c1*n*n+n+5)+"    c2*g(n)   "+(c2*n*n+n+5));

       }
       for(int n=0;n<10;n++)
      {
         if((7*n*n+n+5)>(c1*n*n+n) && (7*n*n+n+5)<(c2*n*n+n+5))
         {
             n1=n;
             break;
         }
       }
      System.out.println("n0 value is "+ n1);
   }
}
