/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={12,10,23,5,6};
	   
	    int count=0;
	    int cou=0;
	    for(int i=0;i<=a.length;i++){
	        if(a[i]%2==0)
	           count++;
	        else
	        cou++;
	        
	        
	    }
	    System.out.println("Number of odd="+cou);
	    System.out.println("Number of even="+count);
	}
}