import java.util.Scanner;
class no3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage :");
        int a=sc.nextInt();
        if (a>=80)
        {
            System.out.println("Distinction");
        }
        else if (a>=60 && a<80)
            {
                System.out.println("First Division");
            }
                else if (a>=45 && a<60)
                {
                    System.out.println("Second Division");
                }
                    else if (a>=40 && a<45)
                    {
                        System.out.println("Pass");
                    }
                        else
                        {
                            System.out.println("Promotion not gtranted");
                        }
    }
}