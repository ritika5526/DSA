package Recursion;
import java.util.*;
public class Pallin_rec {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        System.out.println(isPallin(m));
    }
   public static boolean isPallin(String m){
       if(m.length() == 0 || m.length() == 1)
       return true;
       else{
           if(m.charAt(0) == m.charAt(m.length() - 1))
           return isPallin(m.substring(1,m.length()-1));
       }
       return false;
   }
}
