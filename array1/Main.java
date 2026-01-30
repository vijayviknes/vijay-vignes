/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    int[]a= new int[5];
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the value:");
	    n=in.nextInt();
	    for(int i=0;i<n;i++){
	        a[i]=in.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        System.out.println(a[1]);
	    }
	
	}
}