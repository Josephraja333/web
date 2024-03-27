import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling{

	public void handling(String k){
		int line = 0,charcount=0,wordcount=0;
		boolean cont = false;
		File f = new File("/home/joseph/Documents/j2.txt");
		try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                line++;
                charcount+=s.length();
                if(s.contains(k))cont=true;
                for(int i=0;i<s.length();++i){
                	if(s.charAt(i)==' ')wordcount+=1; 
                }
                wordcount+=1;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("This file doesn't exist");
        } 

        System.out.println("Lines Count: "+line);
        System.out.println("Character Count: "+charcount);
        System.out.println("Word Count: "+wordcount);
        if(cont){
        	System.out.println("The File Contains The Given Word : " + k);
        }
        else{
        	System.out.println("The File Does Not Contains The Given Word : " + k);
        }
	}

	public static void main(String[] args){
		FileHandling obj = new FileHandling();
		System.out.print("Enter a Word To Search On The File: ");
		Scanner scan = new Scanner(System.in);
		String k = scan.nextLine();
		obj.handling(k);
	}
}