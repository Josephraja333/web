import java.util.Scanner;
class calc{
	float  bit = 0;
	float  bytes = 0;
	float  nibble = 0 ;
	public void bitIntoBytes(){
		float x = bit/8;
	 System.out.println(" bit into bytes "+x);
	}
	public void bytesIntoBits(){
		float x = bytes*8;
	 System.out.println("bytes into bites "+x);

	}
        public void bitIntoNibble(){
		float x = bit/4;
            System.out.println("bits into nibble "+x);

	}
	 public void bytesIntoNibble(){
		 float x = bytes*2;
            System.out.println("bytes into nibble "+x);
	 }
	 public void nibbleIntoBytes(){
		 float x = nibble*4/8;
              System.out.println("nibble into bytes "+x);
	 }
         public void nibbleIntobit(){
	
		 float x = nibble*4;
		 System.out.println("nibble into bit is"+x);
	}

	public void value(){
		Scanner r = new Scanner(System.in);
		System.out.print("please enter bit you  want  to converter  ");
		 bit = r.nextInt();
		 System.out.print("please enter bytes you want to converter ");
		 bytes = r.nextInt();
		 System.out.print("please enter nibble you eant to converter");
		 nibble = r.nextInt();
	}
}
public class  dataCalc{
	public static void main(String[] args){
             calc h = new calc();
	     h.value();
	     h.bitIntoBytes();
	     h.bytesIntoBits();
	     h.bitIntoNibble();
	     h.bytesIntoNibble();
	     h.nibbleIntoBytes();
	     h.nibbleIntobit();
	}
}

