/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={12,10,14,7,6};
	    
	    for(int i=0;i<=a.length;i++){
	        boolean flag=true;
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]>a[j]){
	              flag=false;
	            }
	            else{
	              flag=true;
	              break;
	            }
	        }
	        if(flag)
	         System.out.println(a[i]+" is not a leader");
	        
	        else
	         System.out.println("The leader is :"+a[i]);
	         
	    }
	
	}
}