import java.util.Scanner;
import java.util.Arrays;

public class Reverse{
	public static String rev(String s){
		String r ="";
		for(int i = s.length()-1 ; i>=0;i--){
			r += s.charAt(i);
		}
		return r;
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String str = sc.nextLine();
		System.out.println("Reverse string  : "+ rev(str));
		sc.close();
	}
	
}