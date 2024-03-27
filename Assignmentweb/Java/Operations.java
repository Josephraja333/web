import java.lang.Math;
import java.util.Scanner;

public class Operations{

	public static int minimum(int a,int b){
		return Math.min(a,b);
	}

	public static int maximum(int a,int b){
		return Math.max(a,b);
	}

	public static int absolute(int a){
		return Math.abs(a);
	}

	public static double round(double a){
		return Math.ceil(a);
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		while (true){
			System.out.println("1.To find minimum of two numbers");
			System.out.println("2.To find maximum of two numbers");
			System.out.println("3.To find absolute value of a number");
			System.out.println("4.To find rounded of a number");
			System.out.println("5.To Exit");

			int choice = scan.nextInt();

			if (choice==1){
				System.out.println("Enter two numbers");
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(Operations.minimum(a,b));
			}

			else if (choice==2){
				System.out.println("Enter two numbers");
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(Operations.maximum(a,b));
			}

			else if (choice==3){
				System.out.println("Enter a number");
				int a = scan.nextInt();
				System.out.println(Operations.absolute(a));
			}

			else if (choice==4){
				System.out.println("Enter a double number");
				double a = scan.nextDouble();
				System.out.println(Operations.round(a));
			}
			else{
				break;
			}
		}

	}
}