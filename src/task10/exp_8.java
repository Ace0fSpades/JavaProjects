package task10;

import java.lang.*;
import java.util.Scanner;


public class exp_8 {
    public static String recursion_s(String s) {

        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {

                if (s.length() == 2) {
                    return "YES";
                }

                return recursion_s(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static boolean isPalindrome(String text){
            StringBuilder test = new StringBuilder(text).reverse();
            String result = test.toString();
            if (text.equalsIgnoreCase(result)) return true;
            else return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(recursion_s(sc.nextLine()));
        System.out.print(isPalindrome(sc.nextLine()));
    }
}
