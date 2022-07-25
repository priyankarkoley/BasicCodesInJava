import java.util.Scanner;
class random
{
    void main ()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int a=sc.nextInt();
        
        int i=0;
        int s=0;
        for (;a!=0;)
        {
            i=a%10;
            s=s+i;
            a=a/10;
        }
        System.out.println("the sum of digits of the number is "+s);
    }
}
