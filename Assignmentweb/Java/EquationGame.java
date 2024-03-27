import java.util.Scanner;
import java.util.Random;

public class EquationGame{
  public static void main(String args[]){
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String[] equations = {"3+33=36","5-4=1","5*9=45","9%3=0","33+3=36","9*5=45"};
    String[] disp_equations = {"___=36","___=1","___=45","___=0"};
    System.out.println("*************************FOURTE********************");
    System.out.println();

    while(true){

      int index = random.nextInt(disp_equations.length);
      String cur_disp_equation = disp_equations[index];
      String cur_equation = equations[index];
      int operator = findOpr(cur_equation);
      String user_input= "";

      String one = cur_equation.substring(0,operator);
      String two = (cur_equation.substring(operator+1,operator+cur_equation.indexOf('=')-1));
      String thr = String.valueOf(random.nextInt(25));
      String fur = String.valueOf(random.nextInt(9));

      String[] rndmlist = {one,two,thr,fur};
      System.out.println();

      System.out.println("Equation: "+cur_disp_equation);
      System.out.println();
      user_input += chk(scanner, rndmlist[0], rndmlist[1], rndmlist[2], rndmlist[3]);

      if(user_input.equals(rndmlist[0])) rndmlist[0]="*";
      else if(user_input.equals(rndmlist[1])) rndmlist[1]="*";
      else if(user_input.equals(rndmlist[2])) rndmlist[2]="*";
      else if(user_input.equals(rndmlist[3])) rndmlist[3]="*";

      user_input += chk(scanner, "+", "-", "*", "%");
      System.out.println();
      user_input+= chk(scanner,rndmlist[0],rndmlist[1],rndmlist[2],rndmlist[3]);

      user_input+=cur_equation.substring(cur_equation.indexOf('='));
      int i = 0;
      while(i<(equations.length)){
        if(user_input.equals(equations[i])){
            System.out.println("The Answer Is Correct");
            System.out.println();
        }
        i++;
      }
      if(i==(equations.length)-1){
          System.out.println("The Answer Is Wrong "+user_input);
          System.out.println();
          System.out.println("The Correct Answer Is: "+cur_equation);
          System.out.println();
      }
    }
  }

  public static int findOpr(String str){
    if (str.indexOf('+') != -1) { return str.indexOf('+');}
    else if (str.indexOf('-') != -1)  {return str.indexOf('-');}
    else if (str.indexOf('*') != -1)  {return str.indexOf('*');}
    else if (str.indexOf('%') != -1)  {return str.indexOf('%');}
    return -1;
  }

  public static String chk(Scanner scanner,String one,String two,String thr,String fur){
  while(true){
    System.out.println("Choose any one : "+one+ " "+two+ " "+thr+" "+fur+": ");
    String temp = scanner.nextLine();
    if(temp.equals(one) || temp.equals(two) || temp.equals(thr) || temp.equals(fur)) return temp;
    else System.out.println("Invalid Input");
  }
  }

}
