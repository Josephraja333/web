import java.util.*;

public class SpecialCheck{

	String special = "!@#$^";
	String sentence;

	public void getInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		sentence = scan.nextLine();
	}

	public void hasSpecial(){
		boolean flag = true;
		for(int i=0;i<sentence.length();++i){

			if(special.contains(String.valueOf(sentence.charAt(i)))){
				System.out.println("The given sentence contains special character");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("The given sentence does not contains special character");
		}
	}

	public void noAlphabets(){
		boolean alp = false;
		boolean num = false;
		boolean spe = false;

		for(int i=0;i<sentence.length();++i){
			if((sentence.charAt(i)>=65 && sentence.charAt(i)<=90) || (sentence.charAt(i)>=97 && sentence.charAt(i)<=122)){
				alp=true;
				break;
			}

			else if(sentence.charAt(i)>=48 && sentence.charAt(i)<=57){
				num=true;
			}

			else if(sentence.charAt(i)!=' '){
				spe=true;
			}
		}

		if(alp){
				System.out.println("The given sentence contains alphabets");
		}
		else if(num && spe){
			System.out.println("The given sentence contains only numbers and special characters");
		}
		else{
			System.out.println("The given sentence does not contain numbers or special characters");
		}
	}

	public static void main(String[] args){
		SpecialCheck obj = new SpecialCheck();
		obj.getInput();
		obj.hasSpecial();
		obj.noAlphabets();
	}
}