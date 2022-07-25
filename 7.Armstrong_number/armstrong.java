import java.util.Scanner;
class armstrong
{
    void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number :");
         int n=sc.nextInt();
         int i=0;
         int a;
         int s=0;
         a=n;
         for (;n!=0;)
         {
             i=n%10;
             s=s+i*i*i;
             n=n/10;
         }
         if (s==a)
         {
             System.out.println("The number is armstrong");
         }
         else
         {
             System.out.println("The number is not armstrong");
         }
    }
}

