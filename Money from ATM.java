import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        double withdrawl_bal = sc.nextDouble();
        double curr_bal = sc.nextDouble();
        
        if (withdrawl_bal % 5 == 0 && curr_bal >= withdrawl_bal + 0.5){
            curr_bal = curr_bal - (withdrawl_bal + 0.5);
        }
        
        System.out.printf("%.2f",curr_bal);
    }
}
