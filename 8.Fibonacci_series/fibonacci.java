import java.util.Scanner;
class fibonacci
{
    void main()
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the 1st number :");
        int n1=sc.nextInt();
        
        System.out.println("Enter the 2nd number :");
        int n2=sc.nextInt();

        if(n1==0 && n2==0)
        {
            System.out.println("Fibonacci series is not possible");
        }
        else
        {    
            System.out.println(+n1);
            System.out.println(+n2);
            while (i<1000)
            {
                i=n1+n2;
                System.out.println(+i);
                n1=n2;
                n2=i;
            }
        }        
    }
}