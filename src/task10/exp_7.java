package task10;

import java.lang.*;
import java.util.Scanner;

public class exp_7 {
    public static void recursion(int n, int k) {

        if (k > n / 2) {
            System.out.println(n);
            return;
        }

        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion(n, ++k);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        System.out.print(x+" = ");
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier+ " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
        System.out.println();
        recursion(150,2);
    }
}
