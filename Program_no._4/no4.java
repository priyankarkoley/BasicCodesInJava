import java.util.Scanner;
class no4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days :");
        int n=sc.nextInt();
        int y,m,d,i;
        y=n/365;
        i=n%365;
        m=i/30;
        d=i%30;
        System.out.println(+y+ "years and " +m+ "months and " +d+ "days");
    }
}