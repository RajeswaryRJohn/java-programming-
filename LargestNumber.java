import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>=b && a>=c)
        System.out.println("Largest Number:"+a);
        else if(b>=a && b>=c)
        System.out.println("Largest Number:"+b);
        else
        System.out.println("is Largest Number:"+c);
    }
}