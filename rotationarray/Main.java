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
	    int count=0;
	    for(int i=0;i<a.length-1;i++){
	            int j=a.length-1;
	            
	            if(a[i]==b[j]){
	            count=count+1;
	            j--;
	            }
	    }
	    if(count==a.length)
	    System.out.println("It is rotation");
	    else
	    System.out.println("It is not rotation");
	    
	}
}