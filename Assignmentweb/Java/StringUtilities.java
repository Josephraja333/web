import java.util.*;
public class StringUtilities{
	String sentence ="";
	public void getInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");

		while(scan.hasNextLine()){
			String temp = scan.nextLine();
			if(temp.equals("bye")){
				break;
			}		
			sentence = sentence+temp+"\n";
		}
	}
	public int countCharacters(){
		int count =0;
		for (int i=0;i<sentence.length();i++){
			++count;
		}
		return count;
	}
	public int countWords(){
		int count = 0;
		for (int i=0;i<sentence.length();i++){
			if(sentence.charAt(i) == ' '){
				count++;
			}
		}
		return ++count;
	}
	public boolean contains(char a){
		for(int i = 0; i<sentence.length();i++){
			if(a==sentence.charAt(i)){
				return true;
			}
		}
		return false;
	}
	public int countLines(){
		int count = 0;
        for (int i = 0; i<sentence.length(); i++){
            if (sentence.charAt(i) == '\n'){
                count++;
            }
        }
        return count;
	}
	public boolean ContainsCharacters(){
		for (int i=0;i<sentence.length();++i) {
			if(Character.isLetter(sentence.charAt(i))){
				return true;
			}
		}
		return false;
	}
	public String toggleCase(){
		 char[] characters = sentence.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i])) {
                characters[i] = Character.toLowerCase(characters[i]);
            } else if (Character.isLowerCase(characters[i])) {
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        return new String(characters);
	}
	public String toLowerCase(){
		return sentence.toLowerCase();
	}
	public String toUpperCase(){
		return sentence.toUpperCase();
	}
	public String reverse(){
		StringBuilder s = new StringBuilder();
        for (int i = sentence.length() - 2;i >= 0;i--) {
            s.append(sentence.charAt(i));
        }
        return s.toString();
	}
	public static void main(String[] args){
		StringUtilities obj = new StringUtilities();
		obj.getInput();
		System.out.println("sentence: "+obj.sentence);
		int noOfCharacter = obj.countCharacters();
		System.out.println("Character: "+noOfCharacter);
		int noOfWords = obj.countWords();
		System.out.println("words: "+noOfWords);
		System.out.println("Togglecase: "+obj.toggleCase());
	}
}