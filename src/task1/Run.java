package task1;

import java.lang.*;
import java.util.*;

public class Run {
    public static void main(String[] args){
       // SumCycle_for(); // цикл for
       // SumCycle_while(); // цикл while
        //SumCycle_do_while(); // цикл do-while
        //Args_return(); // вывод аргументов командной строки
        //Random_gen(); // массив случайных чисел
        //Harmony(); // гармонческий ряд
        Factorial(); // факториал

    }

    public static void SumCycle_for(){
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       int sum = 0;
       for(int i = 0; i<10;i++){
           arr[i] = sc.nextInt();
           sum+= arr[i];
       }
        System.out.println("Result for: "+sum);
    }
    public static void SumCycle_while(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 9, sum = 0;
        while(i!=-1){
            arr[9-i] = sc.nextInt();
            sum+=arr[9-i];
            i--;
        }
        System.out.println("Result while: "+sum);
    }
    public static void SumCycle_do_while(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0, sum = 0;
        do{
            arr[i] = sc.nextInt();
            sum+= arr[i];
            i++;
        }while(i!=10);
        System.out.println("Result do-while: "+sum);
    }
    public static void Args_return(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] result = str.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i]+" ");
    }
    public static void Harmony(){
        System.out.println("Harmony: ");
        float sum = 0;
        for(int i = 1; i<11;i++){
            System.out.println(("1/"+i));

        }
        System.out.println("Sum: "+sum);
    }
    public static void Random_gen(){
        // Math.random()*(b-a+1)+a
        int arr[] = new int[10];
        for(int i =0;i<10;i++){
            arr[i] = (int)(Math.random()*(100+1));
        }
        System.out.println("Unsorted: ");
        for(int i =0;i<10;i++){
            System.out.println(arr[i]);
        }
        for(int i =9;i>0;i--){
            for(int j =0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("\nSorted: ");
        for(int i =0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Factorial(){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = 1;
        for(int i =1;i<=target;i++){
            result*=i;
        }
        System.out.println("Number: "+target+"\nResult: "+result);
    }
}
