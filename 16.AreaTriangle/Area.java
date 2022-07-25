import java.util.Scanner;
public class Area
{
    public float compute()
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three sides of the triangle :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        int s=a+b+c;
        float ar=s*(s-a)*(s-b)*(s-c);
        return ar;
    }
    
    public static void main()
    {
    Area obj=new Area();
    float area=obj.compute();
    System.out.println("The Area is = "+area);
    //return 0;
    }
}