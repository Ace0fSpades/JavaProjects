package task18;

import java.util.Scanner;

public class Run {
    public static void main(String args[]){
        int a,b;
        int ans;
        System.out.println("Введите два числа, которые нужно поделить: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            ans = a/b;
            System.out.println("Ответ: "+ans);
        }catch (Exception e){
            System.out.println("Делить на 0 нельзя.");
        }
        finally {
            System.out.println("Вы ввели: "+a+" "+b);
        }
    }
}
