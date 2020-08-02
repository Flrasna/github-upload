import java.util.Scanner;

public class M1 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=reader.nextInt();
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f*=i;
		}
		System.out.println("Factorial of given number is "+f);
        reader.close();
        }
}