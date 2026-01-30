/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={13,24,10,23};
	    int[] b={11,22,43};
	    int[] c=new int[a.length+b.length];
	    int i=0;
	    for(int j=0;j<a.length;j++){
	        c[i]=a[j];
	        i++;
	    }
	    for(int j=0;j<b.length;j++){
	        c[i]=b[j];
	        i++;
	    }
	    for(int j=0;j<c.length;j++){
	    System.out.print(c[j]+" ");
	    }
	}
}