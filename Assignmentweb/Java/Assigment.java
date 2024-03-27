class Sequences{
	int definiteNumber;
	public void SetDefiniteNumber(int a){
		definiteNumber = a;
	}
	public void arithmaticSeries(){
		System.out.println("Arithmetric series for"+definiteNumber+" =  "+1+","+(int)(1+1*definiteNumber)+","+(int)(1+2*definiteNumber)+","+(int)(1+3*definiteNumber));
	}
	public void geometricSeries(){
		System.out.println("Geomertic series for "+definiteNumber+ " =  " +1+","+(int)Math.pow(definiteNumber,1)+","+(int)Math.pow(definiteNumber,2)+","+(int)Math.pow(definiteNumber,3));
	}
	
}
public class Assigment{
	public static void main(String[] args){
		Sequences obj = new Sequences();
	        obj.SetDefiniteNumber(1);
		obj.arithmaticSeries();
		obj.geometricSeries();         
                obj.SetDefiniteNumber(20);
                obj.arithmaticSeries();
                obj.geometricSeries();
	}
}
