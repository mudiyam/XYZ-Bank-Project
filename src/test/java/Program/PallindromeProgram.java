package Program;

public class PallindromeProgram {

	public static void main(String[] args) {
		int num=153;
		int sum1=0;
		int rem;
		int temp = num;
		while(num>0)
		{
			rem=num%10;
			sum1=sum1*10+rem;
			num=num/10;
		}
		if(temp==sum1)
		{
			System.out.println("given number is palindrame");
		}
		else
		{
			System.out.println("given number is not palindrame");
		}

	}

}
