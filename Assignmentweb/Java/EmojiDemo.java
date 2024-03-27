import java.util.Scanner;

class Emoji{
          String Word;
	  String Code;
	public void getInput(){
              Scanner input = new Scanner (System.in);
	      System.out.println("DISCLAIMER :  please with this emoji wlinking Face , thumbs up, computer ,worried face , confused face");
	       System.out.println("enter a emoji name :");
	        Word = input.nextLine();
	       System.out.println("enter a sentence with emoji charcter :");

	       Code = input.nextLine();
	}
	public void parse (){
		String[] result = Word.split(":");
		if(result[1].equals("wlinking face")){
			System.out.println(result[0]+"\ud83d\ude09");
		}
		else if (result[1].equals("thumbs up")){
			System.out.println(result[0]+"\ud83d\udc4d");
		}
		else if (result[1].equals("computer")){
			System.out.println(result[0]+"\ud83d\udda5");
		}
		else if (result[1].equals("worried face")){
			System.out.println(result[0]+"\ud83d\ude1f");
		}
		else if(result[1].equals("confused face")){
			System.out.println(result[0]+"\ud83d\ude16");
		}
	}

	public void emojiCode(){
			String [] result = Code.split(":");
			if(result[1].equals("\ud83d\ude09")){
                        System.out.println(result[0]+": wlinking face");
                }        
                else if (result[1].equals("\ud83d\udc4d")){
                        System.out.println(result[0]+": thumbs up");
                }
		else if (result[1].equals("\ud83d\udda5")){
                        System.out.println(result[0]+": computer");                 }

               else if (result[1].equals("\ud83d\ude1f")){
                         System.out.println(result[0]+": worried face"); 
                }

               else if (result[1].equals("\ud83d\ude16")){
                        System.out.println(result[0]+": confused face"); 

                }
	}
}
public class EmojiDemo{
	public static void main (String[] args){


    Emoji h = new Emoji();
    h.getInput();
    h.parse();
    h.emojiCode();
	}
}
