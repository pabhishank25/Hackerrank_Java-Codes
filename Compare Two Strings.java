import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.next().trim();
      String s2=sc.next().trim();
      String ns1=s1.toLowerCase();
      String ns2=s2.toLowerCase();
      if(s1.length()>1 && s1.length()<=100 && s2.length()>1 && s2.length()<=100){
          int n=s1.compareTo(ns2);
          if(n>0){
              System.out.println("1");
              }
          else if(n<0){
              System.out.println("-1");
              }
          else{
              System.out.println("0");
              }
          }
        }
    }
