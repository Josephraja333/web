import java.util.Scanner;
import java.util.Random;

public class Nim{
	int[] arr;
	String s;

	public Nim(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		this.s = scan.next();
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();
		this.arr = new int[n];

		for(int i=0;i<n;++i){
			this.arr[i] = i+1;
		}
	}

	public int Delete(int n){
		if(this.arr.length==0 || this.arr.length==1){
			n = this.arr.length;
			return 1;
		}

		int[] temp = new int[this.arr.length-n];
		for(int i=0;i<temp.length;++i){
			temp[i] = arr[i];
		}
		
		this.arr = temp;
		return 0;
	}

	public boolean chec(int n){
		if(n>2){
			System.out.println("INVALID VALUE");
			return true;
		}
		return false;
	}

	public String toString(){
		String res = "[ ";
		if (this.arr.length!=0) res+=arr[0];

		for (int i = 1;i<this.arr.length;++i){
			res += " , "+arr[i];
		}
		res+= " ]";
		return res;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Nim obj = new Nim();		
		int check = 0;

		while(obj.arr.length!=0){
			System.out.println(obj);
			System.out.println("Enter 1 or 2 elements to delete from the array: ");
			int n = scan.nextInt();

			if(obj.chec(n)){
				continue;
			}

			if(obj.Delete(n)==1){
				check = 1;
				break;
			}

			System.out.println(obj);
			n = rand.nextInt(2)+1;
			System.out.println("Computer Selected: "+n);

			if(obj.Delete(n)==1){
				break;
			}
			
		}

		if(check==1){
				System.out.println(obj.s+" Won the Game");
		}
		else{
			System.out.println("Computer Won the Game");
		}
	}
}