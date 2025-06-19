import java.util.*;
public class Mul
{
	public static void main(String[] args) {
	    int []a =new int[5];
	   int mul=1;
	    Scanner sc=new Scanner (System.in);
	    for (int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	   
	    for(int i=0;i<a.length;i++){
	           mul*=a[i];
	        
	    }
		 System.out.println(mul);
	}
}