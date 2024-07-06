package Program;

public class PallindromeProgram {

	public static void main(String[] args) {
		int num=153;
		int sum1=0;
		int rem;
		int temp = num;
		while(num>0)
		{
<<<<<<< HEAD
			rem=num%10;//Mahendra
=======
			rem=num%10;//sanjeeva
>>>>>>> 5090e35b4822a49b1924a90fcc106c01b851dd31
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
