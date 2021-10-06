package task10;

import java.util.Scanner;

public class exp_9 {
    public static int function(int a, int b){
        if (a > b+1) return 0;
        if (a == 0 || b == 0) return 1;
        return (function(a,b-1)+function(a-1,b-1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sequences: "+function(sc.nextInt(),sc.nextInt()));

    }
}
