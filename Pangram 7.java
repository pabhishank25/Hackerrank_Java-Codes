import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String s=sc.next();
        boolean[] alphalist=new boolean[26];
        int index=0;
        int flag=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                index=s.charAt(i)-'A';
                }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                index=s.charAt(i)-'a';
                }
            alphalist[index]=true;
            }
        for(int i=0;i<=25;i++){
            if(alphalist[i]==false)
                flag=0;
            }
            
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
