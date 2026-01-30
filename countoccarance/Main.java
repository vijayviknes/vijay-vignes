/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={12,2,12,3,12,4};
	    boolean[] visit=new boolean[a.length];
	    int i=0;
	    int j=0;
	    
	    for(i=0;i<a.length;i++){
	        if(visit[i]==true)
	         continue;
	        int count=1;
	        for( j=i+1;j<a.length;j++){
	            if(a[i]==a[j])
	              count++;
	              visit[j]=true;
	        }
	    }
		    System.out.println(a[i]+"count="+ count);
	}
}