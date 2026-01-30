/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a=new int[6];
	    a[0]=0;
	    a[1]=1;
	    System.out.print(a[0]+" ");
	    System.out.print(a[1]+" ");
	    for(int i=2;i<=5;i++){
	        a[i]=a[i-2]+a[i-1];
	        System.out.print(a[i]+" ");
	    }
	
	}
}