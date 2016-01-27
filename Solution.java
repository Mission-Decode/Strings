import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Solution {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++){
            t+="#"+s.charAt(i);
        }
        t+="#$";
        int p[]=new int[t.length()];
        int c=0,r=0,mir=0;
        int max=0;
        for(int i=1;i<t.length()-1;i++){
            mir=2*c-i;
            p[i]=(r>i)?Math.min(r-i,p[mir]):0;
            while((i!=(1+p[i]))&&t.charAt(i-(1+p[i]))==t.charAt(i+(1+p[i]))){
                p[i]++;
            }
            if(i==(1+p[i])){
                p[i]++;
            }
            if((i+p[i])>r){
                c=i;
                r=i+p[i];
            }
        }
        for(int i=0;i<p.length;i++){
            if(p[i]>max){
                max=p[i];
            }
          //  System.out.println(p[i]);
        }
        System.out.println(max);
    }
}