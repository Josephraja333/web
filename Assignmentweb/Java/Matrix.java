import java.util.Scanner;

public class Matrix{
	int[][] mat;
	int row = 0;
	int col = 0;

	public Matrix(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		this.row = scan.nextInt();
		System.out.print("Enter number of coloumns: ");
		this.col = scan.nextInt();
		this.mat = new int[this.row][this.col];

		for(int i=0;i<row;++i){
			for(int j=0;j<col;++j){
				System.out.print("Enter " + i + " row " + j + " col" + " Value: ");
				int n = scan.nextInt();
				this.mat[i][j] = n;
			}
		}
	}

	public void isSquare(){
		if(this.row==this.col){
			System.out.println("The given Matrix is a Square Matrix");
		}
		else{
			System.out.println("The given Matrix is not a Square Matrix");
		}
	}

	public void isUnit(){
		int j=0;
		boolean check = true;
		for(int i=0;i<this.mat.length;++i){

			int temp=0;
			for(int k=0;k<this.mat.length;++k){
				temp+=mat[i][k];
			}

			if(temp!=1 || this.mat[i][j]!=1){
				check=false;
				break;
			}
		
				j+=1;
		}

		if(check){
			System.out.println("The given Matrix is a Unit Matrix");
		}
		else{
			System.out.println("The given Matrix is not a Unit Matrix");
		}
	}

	public void isUpperTri(){
		boolean check = true;
		for(int i=1;i<this.mat.length;++i){
			for(int j=0;j<i;++j){
				if(this.mat[i][j]!=0) check=false;
			}
		}

		if(check){
			System.out.println("The given Matrix is a Upper Triangular Matrix");
		}
		else{
			System.out.println("The given Matrix is not a Upper Triangular Matrix");
		}
	}

	public void isLowerTri(){
		boolean check = true;
		for(int i=0;i<this.mat.length-1;++i){
			for(int j=i+1;j<this.mat.length;++j){
				if(this.mat[i][j]!=0) check=false;
			}
		}

		if(check){
			System.out.println("The given Matrix is a Lower Triangular Matrix");
		}
		else{
			System.out.println("The given Matrix is not a Lower Triangular Matrix");
		}
	}

	public String toString(){
		String res = "[";
		for(int i=0;i<this.mat.length;++i){
			res +="[ " + mat[i][0];

			for(int j=1;j<this.mat[i].length;++j){
				res += " , "+mat[i][j];
			}
			if(i+1!=this.mat.length)res+= " ]," + "\n";
		}
		res+=" ]]";
		
		return res;
	}

	public static void main(String args[]){
		Matrix obj = new Matrix();
		System.out.println(obj);
		obj.isSquare();
		obj.isUnit();
		obj.isUpperTri();
		obj.isLowerTri();
	}

}