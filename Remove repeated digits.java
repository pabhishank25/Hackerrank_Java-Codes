import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long prev_digit=n%10;
        long pow=10;
        long res=prev_digit;
        while(n>0){
            long curr_digit=n%10;
            if(curr_digit!=prev_digit){
                res+=curr_digit*pow;
                prev_digit=curr_digit;
                pow*=10;
    }
            n=n/10;
            }
        
        System.out.println(res);
        }
}
