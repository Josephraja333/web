import java.util.Scanner;

public class AreaCalc{
    public static double areaOfCircle(double r){
        return 3.14*r*r;
    }
    public static double areaOfSquare(double s){
        return s*s;
    }
    public static double areaOfRectangle(double l, double b){
        return l*b;
    }
    public static double areaOfTriangle(double b, double h){
        return (b*h)/2;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1.To find area of circle");
            System.out.println("2.To find area of square");
            System.out.println("3.To find area of rectangle");
            System.out.println("4.To find area of triangle");
            System.out.println("5.To Exit");

            int choice = scan.nextInt();

            if (choice==1){
                System.out.println("Enter radius of the circle");
                double a = scan.nextInt();
                System.out.println(AreaCalc.areaOfCircle(a));
            }

            else if (choice==2){
                System.out.println("Enter side of the square");
                double a = scan.nextInt();
                System.out.println(AreaCalc.areaOfSquare(a));
            }

            else if (choice==3){
                System.out.println("Enter length and breadth of rectangle");
                double a = scan.nextInt();
                double b = scan.nextInt();
                System.out.println(AreaCalc.areaOfRectangle(a,b));
            }

            else if (choice==4){
                System.out.println("Enter base and height of the triangle");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println(AreaCalc.areaOfTriangle(a,b));
            }
            else{
                break;
            }
        }
    }
}