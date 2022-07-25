import java.util.Scanner;
class number
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. :");
        int n=sc.nextInt();
        int c=0;
        for(;n!=0;)
        {
            n=n/10;
            c=c+1;
        }
        System.out.println("The no. of digits of the no. is :"+c);
    }
}