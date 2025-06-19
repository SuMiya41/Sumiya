import java.util.*;
public class Evencount
{
	public static void main(String[] args) {
	    int []a =new int[5];
	   int even=0;
	   int odd=0;
	    Scanner sc=new Scanner (System.in);
	    for (int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	   
	    for(int i=0;i<a.length;i++){
	        if(a[i]%2==0)
	        {
	            even+=1;
	           
	        }
	        else{
	            odd+=1;
	            
	        }
	        
	         
	    }
	    System.out.println(even);
	        System.out.println(odd);
		 
	}
}