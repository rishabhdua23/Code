import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    int T=sc.nextInt();
     int count=0;
        while(T>=1)
        {
            count++;
            int N=sc.nextInt();
            int m=0;
            int count1=0;
            String s="";
            int[] S= new int[N];
            int[] E=new int[N];
            HashMap<Integer, String> hm = new HashMap<Integer, String>();
            ArrayList<ArrayList<Integer> > alist =   new ArrayList<ArrayList<Integer> >(N);
            ArrayList<ArrayList<Integer> > alist2 =   new ArrayList<ArrayList<Integer> >(N);
            for(int i=0;i<N;i++)
            {
                S[i]=sc.nextInt();
                E[i]=sc.nextInt();
            }
            // int diff1=0;
            // int diff2=0;
            // int diff3=0;
            if(N==2)
            {
                // diff1=Math.abs(E[0]-S[0]);
                // diff2=Math.abs(S[1]-S[0]);
                // diff3=Math.abs(E[1]-E[0]);
                if(S[1]>=E[0]||E[1]<=S[0])
                s=s+"CC";
                else
                s=s+"CJ";
            }
            else
            {
                
            for(int i=0;i<N;i++)
            {
                m=0;
                ArrayList<Integer> a1 = new ArrayList<Integer>(N); 
                if(alist.size()<1)
                {
                    
                hm.put(i,"C");
                count1++;
                a1.add(S[i]);
                a1.add(E[i]);
                alist.add(a1);
                continue;
                }
                else{
                     
                    for (int l = 0; l < alist.size(); l++) { 
            for (int p = 0; p < alist.get(l).size()-1; p++) { 
                 if(E[i]<=alist.get(l).get(p) || S[i]>=alist.get(l).get(p+1))
                 {
                     m++;
                 }
                else
                break;
                 }
            }
            if(m==alist.size())
            {
                
               hm.put(i,"C");
                count1++;
                a1.add(S[i]);
                a1.add(E[i]);
                alist.add(a1);  
            }
                    
                }
            }
        //     for (int l = 0; l < alist.size(); l++) { 
        //     for (int p = 0; p < alist.get(l).size(); p++) { 
        //         System.out.print(alist.get(l).get(p) + " "); 
        //     } 
        //     System.out.println(); 
        // } 
                for(int i=0;i<N;i++)
            {
                m=0;
                 ArrayList<Integer> a2 = new ArrayList<Integer>(N); 
                if(alist2.size()<1)
                {
                    if(!hm.containsKey(i))
                    {
                       
                hm.put(i,"J");
                count1++;
                a2.add(S[i]);
                a2.add(E[i]);
                alist2.add(a2);
                continue;
                }
                else
                continue;
                }
                else{
                    if(!hm.containsKey(i))
                    {
                    for (int l = 0; l < alist2.size(); l++) { 
            for (int p = 0; p < alist2.get(l).size()-1; p++) { 
                 if(E[i]<=alist2.get(l).get(p) || S[i]>=alist2.get(l).get(p+1))
                 {
                      m++;
                 }
                else
                break;
                 }
            }
            if(m==alist2.size())
            {
              hm.put(i,"J");
                count1++;
                a2.add(S[i]);
                a2.add(E[i]);
                alist2.add(a2);  
            }
                    
                }
                }
            } 
            
            //     for(int j=i+1;j<N;j++)
            //     {
            //         diff2=Math.abs(S[j]-S[i]);
            //         diff3=Math.abs(E[j]-E[i]);
            //         if(diff1<=diff2&&diff1<=diff3)
            //         {
            //           if(!hm.containsKey(j)&&m<1) 
            //           {
            //               hm.put(j,"C");
            //               count1++;
            //           }
            //           else if(!hm.containsKey(j)&&m>=1)
            //           {
            //               hm.put(j,"J");
            //               count1++;
            //           }
            //           else
            //           continue;
                       
            //         }
            //         else
            //         continue;
            //     }
            //     }
            //     m++;
            // }
        //       for (int l = 0; l < alist2.size(); l++) { 
        //     for (int p = 0; p < alist2.get(l).size(); p++) { 
        //         System.out.print(alist2.get(l).get(p) + " "); 
        //     } 
        //     System.out.println(); 
        // } 
            // System.out.println("Count1="+count1);
             if(count1<N)
            s=s+"IMPOSSIBLE";
            else
            {
                Iterator hmIterator = hm.entrySet().iterator();
                while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            s = s+ ((String)mapElement.getValue()); 
        }
            }
            }
               System.out.println("Case #"+count+": "+s);
            T--;
        }
    }
}
           