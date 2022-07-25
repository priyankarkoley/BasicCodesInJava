import java.util.Scanner;
class no1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no. :");
        int a=sc.nextInt();
        System.out.println("Enter the second no. :");
        int b=sc.nextInt();
        int s,c;
        if (a>b)
        {
        s=b*b;
        c=a*a*a;
        System.out.println("The cube of greater no.=" +c);
        System.out.println("The square of smaller no.=" +s);
        }
        else if (b>a)
            {
            s=a*a;
            c=b*b*b;
            System.out.println("The cube of greater no.=" +c);
            System.out.println("The square of smaller no.=" +s);
            }
            else
        {
            System.out.println("The numbers are equal");
        }
    }
}