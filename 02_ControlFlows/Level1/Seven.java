import java.util.Scanner;
public class Seven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month (1 -12) : ");
		int month = sc.nextInt();
		System.out.println("Enter the day : ");
		int day = sc.nextInt();
		if(( month>3 && month<6) || ( month==3 && day>=20) || (month==6 && day<=20) ){
			System.out.println("It's a spring season");
		} else{
			System.out.println("It's not a spring season");
		}
	}
}