import java.util.Scanner;

public class ArrayManipulation{
	int[] a;

	ArrayManipulation(int[] data){
		this.a = data;
	}

	public ArrayManipulation add(int value){
		int temp[] = new int[this.a.length+1];

		for(int i=0;i<a.length;++i){
			temp[i]=a[i];
		}
		temp[this.a.length] = value;
		System.out.println(value+" Element Added");
		return new ArrayManipulation(temp);
	}

	public ArrayManipulation remove(int value){
		int temp[] = new int[this.a.length-1];
		int ind = 0;
		for(int i=0;i<a.length;++i){
			if(value!=a[i]){
				temp[ind++] = a[i];
			}
		}
		System.out.println(value+" Element removed");
		return new ArrayManipulation(temp);
	}

	public ArrayManipulation modify(int value,int index){
		System.out.println(a[index]+" Element modified into "+value);
		a[index] = value;
		return new ArrayManipulation(a);
	}

	public String toString(){
		String res = "[ ";
		if (this.a.length!=0) res+=a[0];

		for (int i = 1;i<this.a.length;++i){
			res += " , "+a[i];
		}
		res+= " ]";
		return res;
	}

	public static void main(String[] args){
		ArrayManipulation obj = new ArrayManipulation(new int[]{1,2,3,4,5});
		System.out.println(obj.add(6));
		System.out.println(obj.remove(2));
		System.out.println(obj.modify(10,3));
	}
}