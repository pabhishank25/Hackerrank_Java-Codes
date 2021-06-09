import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k[] = new int[1000+1];
        k[0]  = sc.nextInt();
        long n = sc.nextLong();
        int w = sc.nextInt();
        int sum = 0;
        long ans = 0;
    
        for(int i=1;i<=w;i++)
        {
            k[i] = k[0]*i;
        }
        
        for(int i=1;i<=w;i++)
        {
            sum = sum + k[i];
        }
        
        ans = sum-n;
        
        if(n>sum)
        {
            System.out.println(0);
        }
        else
        {
        System.out.println(ans);
    }
}
}
