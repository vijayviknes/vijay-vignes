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
	    for(int i=0;i<a.length-1;i++){
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]>a[j]){
	                int temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	            }
	        }
	    }
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
		
	}
}