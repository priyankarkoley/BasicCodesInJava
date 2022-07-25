import java.util.Scanner;
class reverse
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        
        int i=0;
        int re=0;
        for(;n!=0;)
        {
             i=n%10;
             re=re*10+i;
             n=n/10;
        }
        System.out.println("The reverse number :"+re);
        
    }
}