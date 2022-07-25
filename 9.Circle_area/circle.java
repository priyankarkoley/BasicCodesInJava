import java.util.Scanner;
class circle
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the radius of circle");
        double r=sc.nextFloat();
        
        double pi=3.14;
        double Ar;
        Ar=pi*r*r;
        System.out.println("The area of the circle :"+Ar);
    }
}