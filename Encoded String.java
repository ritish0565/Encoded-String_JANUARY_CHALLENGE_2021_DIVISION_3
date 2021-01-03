/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.lang.Integer;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
		
		for(int l=0;l<t;l++)
		{
		    
		  int n=s.nextInt();
		  s.nextLine();
          String ms = s.nextLine();
          int parts = n/4;
          String[] sarr = new String[parts];
            int t1=0;
      
            for(int i=0;i<ms.length();i=i+4){
                String p = ms.substring(i,i+4);
                sarr[t1] = p;
                t1++;
            } 
          
            for(int i=0;i<sarr.length;i++){
                int x = Integer.parseInt(sarr[i],2);
                System.out.print(arr[x]);
            }
          
            System.out.println();
		}
        
          
	}
}

/*

*/
