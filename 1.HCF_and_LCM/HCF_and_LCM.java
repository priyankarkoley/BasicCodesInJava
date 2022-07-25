import java.util.Scanner;
class HCF_and_LCM
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no. :");
        int m=sc.nextInt();
        System.out.println("Enter the second no. :");
        int n=sc.nextInt();
        int t;
        int u;
        int v;
        int l;
        u=m;
        v=n;
        if(m>n)
        {
            while(n!=0)
            {
                t=m%n;
                m=n;
                n=t;
            }
            l=(n*v)/m;
            System.out.println("HCF is:"+m);
            System.out.println("LCM is:"+l);
        }
        else
        {
            while(m!=0)
            {
                t=n%m;
                n=m;
                m=t;
            }
            l=(u*v)/n;
            System.out.println("HCF is:"+n);
            System.out.println("LCM is:"+l);

        }
        
    }

}