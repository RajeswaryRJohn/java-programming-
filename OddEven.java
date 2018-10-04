import java.util.*;
class OddEven
{
  public static void main(String args[])
  {
	Scanner ob = new Scanner(System.in);
	int i;
	System.out.println("Enter any integer to check whether its odd or even...");
	i = ob.nextInt();
	if(i%2==0)
	{
		System.out.println("You entered an even number");
	}
	else if(i%2!=0)
	{
		System.out.println("You entered an odd number");
	}
  else
  {
    System.out.println("You entered an invalid input");
  }
  }
}