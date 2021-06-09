import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner reader = new Scanner(System.in);
        String word = reader.next();
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
    }
}
