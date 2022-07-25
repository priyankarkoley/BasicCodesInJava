import java.util.Scanner;
class palindrome
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        
        int i=0;
        int a=0;
        int re=0;
        a=n;
        for(;n!=0;)
        {
            i=n%10;
            re=re*10+i;
            n=n/10;
        }
        if(re==a)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}