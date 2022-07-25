import java.util.Scanner;
class yearcheck
{
    void main ()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a year :");
        int n=sc.nextInt();
        if(n%100==0)
        {
            if(n%400==0)
            {
                System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not leap year");
            }
        }
        else
        {
            if(n%4==0)
            {   
                System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not leap year");
            }
        }
    }
    

}