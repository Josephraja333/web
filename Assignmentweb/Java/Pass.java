import java.util.Scanner;

public class Pass{
    public static void main(String[] args) {
        PasswordChecker obj = new PasswordChecker();
        obj.input();
        if(obj.isValidLength() && obj.hasSpecialCharacter() && obj.hasDigit() && obj.isCaps() && obj.isLow()){
            System.out.println("The password is Strong");
        }
        else{
            System.out.println("The password is Weak");
        }
    }
}

class PasswordChecker{
    
    String password;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        password = sc.nextLine();
    }
    
    public boolean isValidLength(){
        if(password.length()>=8){
            return true;
        }
        return false;
    }
    
    public boolean hasSpecialCharacter(){
        for (int i = 0; i < password.length(); i++) {
	     int as = (int) password.charAt(i);
	     if ((as >= 32 && as <= 47) || (as>= 58 && as<= 64)|| (as >= 91 && as <= 96) || (as >= 123 && as <= 126)) {
				return true;
		}
	}
	return false;
    }
    
    public boolean hasDigit(){
        for(int i=0;i<password.length();++i){
            if(Character.isDigit(password.charAt(i))){
            return true;
        }
        }
        return false;
    }
    
    public boolean isCaps(){
        for(int i=0;i<password.length();++i){
            if(Character.isUpperCase(password.charAt(i))){
            return true;
        }
        }
        return false;
    }
    
    public boolean isLow(){
        for(int i=0;i<password.length();++i){
            if(Character.isLowerCase(password.charAt(i))){
            return true;
        }
        }
        return false;
    }
}
