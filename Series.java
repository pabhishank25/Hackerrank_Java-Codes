import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=7;
        int n=sc.nextInt();
        for(int i=1;i<=n-1;i++){
            a=(a*2)+i;
    }
        System.out.println(a);
        }
}
