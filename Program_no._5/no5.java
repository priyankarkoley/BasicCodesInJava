import java.util.Scanner;
class no5
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A :");
        int a=sc.nextInt();
        System.out.println("Enter the value of B :");
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping the value of A = "+a+" and the value of B = "+b);
    }
}