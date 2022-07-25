class sum
{
    void main()
    {
        int i=1;
        int c=0;
        int s=0;
        while (c<=50)
        {
            s=s+i;
            c=c+1;
            i=i+1;
        }
        System.out.println("The sum of first 50 natural numbers is" +s);
    }
}