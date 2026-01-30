/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the value:");
	    int n1=in.nextInt();
	    System.out.println("Enter the value:");
	    int n2=in.nextInt();
	    int sum=n1+n2;
		System.out.println("The sum of values="+Integer.toHexString(sum));
	}
}