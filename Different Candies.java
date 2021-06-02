import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static int check(String s){
        String s1="";
        for(int i=0;i<s.length();i++){
            if(!s1.contains(String.valueOf(s.charAt(i)))){
                s1=s1+String.valueOf(s.charAt(i));
            }
        }
        return s1.length();
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            int res=check(s);
            System.out.println(res);
            t--;
        }
    }
}
