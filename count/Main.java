/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={15,10,8,15,8,15};
	    int count=0;
	    for(int i=0;i<a.length;i++){
	        for(int j=i+1;j<a.length;j++)
	        
	        if(a[i]==a[j])
	        count=count+1;
	    }
	    
		System.out.println("the number of count="+count);
	}
}