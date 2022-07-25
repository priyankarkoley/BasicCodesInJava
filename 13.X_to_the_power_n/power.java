import java.lang.Math;
import java.util.Scanner;
class power
{
    void main()
    {
        int c=0;
        int p=1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the base :");
        int base=sc.nextInt();
        
        System.out.println("Enter the index :");
        int ind=sc.nextInt();
        
        /**for(;c<ind;)
        {
            p=p*base;
            c=c+1;
        }**/
        
        p=(int)Math.pow(base, ind);
        System.out.println(+p);
        
    }
}