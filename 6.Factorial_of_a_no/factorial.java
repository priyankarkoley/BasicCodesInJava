import java.util.Scanner;
class factorial
{
    void main()
    {   
        int i=1;
        int F=1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n=sc.nextInt();
    
        if (n<0)
        {
            System.out.println("Factorial is not possible");
        }
        else
        {
            for(;i<=n;)
            {
                F=i*F;
                i=i+1;
            }
            System.out.println("Factorial is " +F);
        }
    }
}