import java.util.Scanner;

class FormulaCalc{
    int l = 0;
    int w = 0;
    int h = 0;
    
    public float findX(){
        float x = 2*((w*l)+(h*l)+(h*w));
        return x;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = scan.nextInt();
        System.out.println("Enter the width: ");
        w = scan.nextInt();
        System.out.println("Enter the height: ");
        h = scan.nextInt();
    }
}

public class AreaCalculator{
    public static void main(String[] args) {
        FormulaCalc obj = new FormulaCalc();
        obj.input();
        System.out.println(obj.findX());
    }
}
