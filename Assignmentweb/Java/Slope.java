public class Slope{
	int m = 0;
	int x = 0;
	int c = 0;
	int y = 0;

	public Slope(int M, int X, int C){
		m = M;
		x = X;
		c = C;
	}

	public int getM(){
		return m;
	}	

	public int getX(){
		return x;
	}	

	public int getC(){
		return c;
	}	

	public void setM(int M){
		m = M;
	}

	public void setX(int X){
		x = X;
	}

	public void setC(int C){
		c = C;
	}

	public int evaluate(){
		y = (m*x)+c;
		return y;
	}

	public static void main(String[] args){
		Slope obj = new Slope(7,8,9);
		obj.setM(5);
	
		System.out.println(obj.getC());
		System.out.println(obj.evaluate());
	}
}