import java.io.*;
import java.util.*;

public class Solution{
    
    static int lucky(String a){
        int k=Integer.parseInt(a);
        int f=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='4' || a.charAt(i)=='7'){
                f=1;
                }
            else{
                f=0;
                break;
                }
            }
        if(f==1)
            return 1;
        else
            return check(k);
        }
    static int check(int k){
        for(int j=2;j<k/2;j++){
            if(k%j==0&&lucky(String.valueOf(j))==1)
                return 1;
            }
        return 0;
        }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    if(lucky(a)==1)
        System.out.println("YES");
    else
        System.out.println("NO");
    }
    }
