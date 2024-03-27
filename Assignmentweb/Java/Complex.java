import java.lang.Math;

public class Complex {
    private double real;
    private double imaginary;
    public Complex(){
        this.real = 3;
        this.imaginary = 5;
    }
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary=imaginary;
    }
    public String toString(){
        if(imaginary<0){
            return (this.real+" - "+Math.abs(this.imaginary)+"i");
        }
        
        return (this.real+" + "+this.imaginary+"i");
    }
    public Complex add(Complex obj){
        return new Complex(this.real+ obj.real,this.imaginary+obj.imaginary);
    }

    public Complex multiply(Complex obj){
        return new Complex((this.real*obj.real)+(-1*this.imaginary*obj.imaginary),(this.real*obj.imaginary)+(this.imaginary*obj.real));
    }

    public Complex sub(Complex obj){
        return new Complex(Math.abs(this.real- obj.real),Math.abs(this.imaginary-obj.imaginary));
    }

    public Complex division(Complex obj){
        double a = obj.imaginary*-1;
        return new Complex(((this.real*obj.real)+(-1*this.imaginary*a))/((this.real*this.real)+(this.imaginary*this.imaginary)),(-1*((this.real*a)+(this.imaginary*obj.real)))/((this.real*this.real)+(this.imaginary*this.imaginary)));
        
    }

    public static void main(String[] args) {
        Complex obj = new Complex(4,-3);
        Complex obj1 = new Complex(4,3);
        System.out.println(obj1.add(obj));
        System.out.println(obj1.multiply(obj));
        System.out.println(obj1.sub(obj));
        System.out.println(obj1.division(obj));
    }
}