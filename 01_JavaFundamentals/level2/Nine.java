import java.util.Scanner;
public class Nine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i=n-1;i>=1;i--){
			if(n%i==0){
				System.out.print("Greatest factor of " + n + " is " + i);\
				break;
			}
		}
		sc.close();
	}
}