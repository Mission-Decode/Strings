import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while(true){
        try{
        	int n=sc.nextInt();	
        }
        catch(Exception e){
            break;
        }
        String p=sc.next();
        String t1=sc.next();
        char text[]=t1.toCharArray();
        char pat[]=p.toCharArray();
        if(p.length()>t1.length()){
            System.out.println();
        }
        else {
        int f[]=new int[pat.length];
        f[0]=0;
        int j=0;
        for(int i=1;i<pat.length;){
            if(pat[i]==pat[j]){
                f[i]=j+1;
                i++;
                j++;
            }
            else {
                if(j>0){
                j=f[j-1];
             }
                else {
                f[i]=0;
                i++;
             }
            }
        }
        int i=0;
        j=0;
        boolean b=false;
        while(i<text.length&&j<pat.length){
            if(pat[j]==text[i]){ 
               i++;
               j++;
               if(j==pat.length){
                  System.out.println(i-pat.length);
                  b=true;
                  j=f[j-1];
               }
            }
            else if(j>0){ 
                j=f[j-1];
            }
            else {
                i++;
            }
        }
        if(!b) {
            System.out.println();
        }
        System.out.println();
            
        }
        }
    }
}