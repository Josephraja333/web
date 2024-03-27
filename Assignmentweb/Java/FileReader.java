import java.io.*;
import java.util.Scanner;
public class FileReader{
    String reversed = "";
    public void printFileContent(String fileName1){
        Scanner sc = null;
        try {
            sc = new Scanner(new File(fileName1));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
    public void reverseNow(String fileName1){
        Scanner sc = null;
        try {
            sc = new Scanner(new File(fileName1));
            reversed = "";
            while(sc.hasNextLine()){
                reversed=(sc.nextLine()+"\n"+reversed);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
    public void writeReversed(String fileName2){
        try{
            FileWriter fw = new FileWriter(fileName2);
            fw.write(reversed);
            fw.close();
            printFileContent(fileName2);
        }catch (Exception e){
            System.out.println("Unable to write in this file!");
        }
    }
    public static void main(String[] args) {
        FileReader fr = new FileReader();
        String fileName1 = "/home/joseph/Documents/j1.txt";
        String fileName2 = "/home/joseph/Documents/j2.txt";
        System.out.println("Original txt : ");
        fr.printFileContent(fileName1);
        fr.reverseNow(fileName1);
        System.out.println("\nReversed txt : ");
        fr.writeReversed(fileName2);
    }
}