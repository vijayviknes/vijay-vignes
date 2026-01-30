/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={1,1,1,1,1,1,1};
	    int k=5;
	    int sum=0,len=0,l=0;
	    for(int i=0;i<=a.length-1;i++){
	        sum=0;
	        for(int j=i;j<=a.length-1;j++){
	            sum+=a[j];
	            if(sum>=k)
	             if(sum==k)
	              l=j-i+1;
	        }
	        if(l>len) 
	          len=l;
	    }
	    System.out.println(len);
	}
}