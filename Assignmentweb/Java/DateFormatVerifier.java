import java.util.*;

public class DateFormatVerifier{
	
	String date = "03/01/2006";
	int d = 0;
	int m = 0;
	int y = 0;
	
	public int getDay(){
		String temp = date.substring(0,2);
		int d=Integer.parseInt(temp);  
		return d;
	}
	
	public int getMonth(){
		String temp = date.substring(3,5);
		int m=Integer.parseInt(temp);  
		return m;
	}
	
	public int getYear(){
		String temp = date.substring(6,10);
		int y=Integer.parseInt(temp);  
		return y;
	}
	
	public boolean isFirstSlashExist(){
		if(date.charAt(2)=='/'){
			return true;
		}
		return false;
	}
	
	public boolean isSecondSlashExist(){
		if(date.charAt(5)=='/'){
			return true;
		}
		return false;
	}
	
	public boolean isValidDay(){
		if(d>0 && d<=31){
			return true;
		}
		return false;
	}
	
	public boolean isValidDayCount(){
                if (isFirstSlashExist()){
                                return true;
                      }
                return false;
        }

	public boolean isValidDayWithRespectToMonth(){
		if(m==2 && d>0 && d<=28){
			return true;
		}
		
		else if(m%2==0 && m!=2 && d>0 && d<=30){
			return true;
		} 
		
		else if(m%2==0 && m!=2 && d>0 && d<=30){
			return true;
		} 
		return false;
	}
	
	public boolean isValidMonth(){
		if(m>0 && m<=12){
			return true;
		}
		return false;
	}
	
	public boolean isValidMonthCount(){
		
		if (isFirstSlashExist() && isSecondSlashExist()){
                                return true;
                        }
                      
                return false;
	}

	public boolean isValidYear(){
		if(y>999){
			return true;
		}
		return false;
	}
	
	public boolean isValidYearCount(){
		if (isSecondSlashExist()){
                                return true;
                      }
                return false;
	}
	
	public static void main(String args[]){
		DateFormatVerifier obj = new DateFormatVerifier();
		System.out.println(obj.getDay());
		System.out.println(obj.getMonth());
		System.out.println(obj.getYear());
		
		
	}
}
