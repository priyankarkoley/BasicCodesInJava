class primecheck1
{
    void main(int n)
    {
        int i=1;
        int d=0;
        while(i<=n)
        {
            if(n%i==0)
            {
                d=d+1;
                i=i+1;
            }
            else
            {
                i=i+1;
            }
        }
        if(d==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
}
