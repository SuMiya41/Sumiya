import java.util.*;
public class Digits
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
			if(Character.isDigit(ch)==false) {
				System.out.println(" not Digits");
				System.exit(0);
			}
			
		}
		System.out.println("Digits");

	}
}