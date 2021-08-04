package Recursion;
import java.util.*;

//import jdk.nashorn.internal.parser.Scanner;
public class Reverse_string {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        if(s.length() == 0)
        return s;
        else{
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
