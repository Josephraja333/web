import java.util.Scanner;

public class Ceaser{
	String pass;

	Ceaser(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a password to encrypt: ");
		this.pass = scan.next();
	}

	public void encrypt(){
		String s = "";
		for(int i=0;i<this.pass.length();++i){
			int a =  pass.charAt(i)+3;
			if(a>=124)a-=95;

			s += (char)a;
		}
		this.pass = s;
		System.out.println(this.pass);
	}

	public void decrypt(){
		String s = "";
		for(int i=0;i<this.pass.length();++i){
			int a =  pass.charAt(i)-3;
			if(a<=34)a+=95;
			
			s += (char)a;
		}
		this.pass = s;
		System.out.println(this.pass);
	}

	public static void main(String[] args){
		Ceaser obj = new Ceaser();
		obj.encrypt();
		obj.decrypt();
	}
}