import java.util.*;
public class Changecases
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=" ";
		for(int i=0;i<a.length();i++){
		    char ch=a.charAt(i);
		    if(Character.isUpperCase(ch)){
		         char c=Character.toLowerCase(ch);
		        b+=c;
		    }
		    else{  
		        char c=Character.toUpperCase(ch);
		        b+=c;
		        
		    }
		}
		        System.out.println(b);
		

		

	}
}