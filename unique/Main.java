/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={15,10,8,8,15,8};
	    for(int i=0;i<a.length;i++){
	        int count=0;
	    for(int j=0;j<a.length;j++){
	        if(a[i]==a[j]){
	            count++;
	        }
	    }
	    if(count==1){
	        System.out.print(a[i]);  
	    }
	    }
	}
}	