package Recursion;

import java.util.*;
class Sum_of_natural_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
   public static int sum(int n){
       if(n == 1)
       return n; 

       else 
           return n + sum(n-1);
   }

}