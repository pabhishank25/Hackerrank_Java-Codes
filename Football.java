import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="0000000";
        String s2="1111111";
        if(s.contains(s1) || s.contains(s2)){
            System.out.println("YES");
    }
        else{
           System.out.println("NO");
        }
    }
}
