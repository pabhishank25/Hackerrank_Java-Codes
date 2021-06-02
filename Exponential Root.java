import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long s=(long)Math.pow(a,b);
        s=s%9;
        if(s==0)
            {
            System.out.println(9);
            }
        else
            {
            System.out.println(s);
            }
    }
}
