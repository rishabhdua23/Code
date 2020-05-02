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
            
            String s1="";
            String s2="";
            String s3="";
            String NS="";
                int b1=0;
                int b2=0;
                int b3=0;
                char c1;
                char c2;
                char c3;
                int diff1=0;
                int diff2=0;
                int diff3=0;
                int b4=0;
                    int b5=0;
                    int b6=0;
                    char c4;
                    char c5;
                    char c6;
            count++;
            String S = sc.next();
            int a=S.length();
            if(a%2==0)
            {
                c1=S.charAt(0);
                c2=S.charAt(a-1);
                c3=S.charAt(a-2);
                b1=Integer.parseInt(String.valueOf(c1));
                b2=Integer.parseInt(String.valueOf(c2));
                b3=Integer.parseInt(String.valueOf(c3));
                for(int i=0;i<b1;i++)
                {
                    s1=s1+"(";
                }
                s1=s1+Integer.toString(b1);
                diff1=b2-b3;
                if(diff1>0)
                {
                    for(int i=0;i<diff1;i++)
                    {
                        s3=s3+"(";
                    }
                    s3=s3+Integer.toString(b2);
                    for(int i=0;i<b2;i++)
                    {
                        s3=s3+")";
                    }
                }
                else if(diff1<0)
                {
                    for(int i=0;i<Math.abs(diff1);i++)
                    {
                        s3=s3+")";
                    }
                    s3=s3+Integer.toString(b2);
                    for(int i=0;i<b2;i++)
                    {
                        s3=s3+")";
                    }
                }
                else
                {
                    s3=s3+Integer.toString(b2);
                    for(int i=0;i<b2;i++)
                    {
                        s3=s3+")";
                    }
                }
                for(int i=1;i<a-1;i=i+2)
                {
                    c4=S.charAt(i);
                    c5=S.charAt(i-1);
                    c6=S.charAt(i+1);
                b4=Integer.parseInt(String.valueOf(c4));
                b5=Integer.parseInt(String.valueOf(c5));
                b6=Integer.parseInt(String.valueOf(c6));
                diff2=b4-b5;
                diff3=b4-b6;
                if(diff2<0&&diff3<0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2<0&&diff3>0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2>0&&diff3<0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2>0&&diff3>0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2==0&&diff3>0)
                {
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2==0&&diff3<0)
                {
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2>0&&diff3==0)
                {
                     for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2<0&&diff3==0)
                {
                     for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2==0&&diff3==0)
                {
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                }
                
             NS=s1+s2+s3;   
            }
            else
            {
                c1=S.charAt(0);
                c2=S.charAt(a-1);
                b1=Integer.parseInt(String.valueOf(c1));
                b2=Integer.parseInt(String.valueOf(c2));
                for(int i=0;i<b1;i++)
                {
                    s1=s1+"(";
                }
                s1=s1+Integer.toString(b1);
                    for(int i=0;i<b2;i++)
                    {
                        s3=s3+")";
                    }
             
                for(int i=1;i<a-1;i=i+2)
                {
                    c4=S.charAt(i);
                    c5=S.charAt(i-1);
                    c6=S.charAt(i+1);
                b4=Integer.parseInt(String.valueOf(c4));
                b5=Integer.parseInt(String.valueOf(c5));
                b6=Integer.parseInt(String.valueOf(c6));
                diff2=b4-b5;
                diff3=b4-b6;
                if(diff2<0&&diff3<0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2<0&&diff3>0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2>0&&diff3<0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2>0&&diff3>0)
                {
                    for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2==0&&diff3>0)
                {
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b6);
                }
                if(diff2==0&&diff3<0)
                {
                    s2=s2+Integer.toString(b4);
                    for(int j=0;j<Math.abs(diff3);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2>0&&diff3==0)
                {
                     for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+"(";
                    }
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2<0&&diff3==0)
                {
                     for(int j=0;j<Math.abs(diff2);j++)
                    {
                        s2=s2+")";
                    }
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                 if(diff2==0&&diff3==0)
                {
                    s2=s2+Integer.toString(b4);
                    s2=s2+Integer.toString(b6);
                }
                }
                
             NS=s1+s2+s3;  
            }
              System.out.println("Case #"+count+": "+NS);
            T--;
        }
    }
}
            