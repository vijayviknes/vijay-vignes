/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={10,12,14,18,20};
	    int[] b={20,18,14,12,10};
	    boolean flag=true;
	    for(int i=0,j=a.length-1;i<a.length-1&&j>0;i++,j--){
	            
	            if(a[i]!=b[j]){
	            flag=false;
	            }
	            break;
	    }
	    if(flag)
	    System.out.println("It is rotation");
	    else
	    System.out.println("It is not rotation");
	    
	}
}