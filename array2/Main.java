/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={10,3,4,-5,6,-100};
	    int min1=a[0];
	    int min2=a[1];
	    int min3=a[2];
	    for(int i=1;i<a.length;i++){
	        if (a[i]<min1)
	        min1=a[i];
	    }
	    for(int i=0;i<a.length;i++){
	        if(min1<a[i] && a[i]<min2)
	        min2=a[i];
	    }
	     for(int i=0;i<a.length;i++){
	        if(min2<a[i] && a[i]<min3)
	        min3=a[i];
	    }
	    System.out.println("Minimum="+min1);
	    System.out.println("2 min="+min2);
		 System.out.println("3 min="+min3);
	}
}