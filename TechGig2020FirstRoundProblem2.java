/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        
        while(T>=1)
        { 
            int N= sc.nextInt();
        long[] a =new long[N];
        long[] b=new long[N];
        int i;
            int k=0,count=0;
           for(i=0;i<N;i++)
        {
           a[i]=sc.nextLong();
         }
       for(i=0;i<N;i++)
        {
           b[i]=sc.nextLong();
         } 
        Arrays.sort(a);
        Arrays.sort(b);
        for(i=0;i<N;i++)
        {
            for(int j=k;j<N;j++)
            {
                if(b[i]<a[j])
                {
                    k++;
                    count++;
                    break;
                }
                else
                {
                    k++;
                    continue;
                }
            }
        }
           System.out.println(count);
           T--;
            }//Write code here

   }
}

