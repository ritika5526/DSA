package Recursion;
import java.util.*;
public class DectoBin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(conv(n,""));
    }
    public static String conv(int n,String m){
        if(n == 0)
        return m;
        else{
            m = n%2 + m;
            return conv(n/2,m);
        }
    }
}
