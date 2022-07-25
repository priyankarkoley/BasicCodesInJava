import java.util.Scanner;
class no2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of trianle :");
        int a=sc.nextInt();
        System.out.println("Enter the second side of triangle:");
        int b=sc.nextInt();
        System.out.println("Enter the third side of traingtle :");
        int c=sc.nextInt();
        if (a==b && b==c)
        {
            System.out.println("The triangle is Equilateral ");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("The triangle is Isosceles ");
        }
        else
        {
            System.out.println("The triangle is Scalene ");
        }
    }
}
