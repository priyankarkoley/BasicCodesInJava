import java.util.Scanner;
class odd
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your limit of numbers :");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        int c=0;
        
        for(;c<n;)
        {
            s=s+i;
            i=i+2;
            c=c+1;
        }
        System.out.println("The sum of the numbers is :" +s);
        
    }
}