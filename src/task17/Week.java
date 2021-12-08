package task17;

import java.util.Random;
import java.util.Scanner;

enum Day_of_Week{
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");
    private String title;
    Day_of_Week(String t){
        title = t;
    }

    @Override
    public String toString() {
        return "Day_of_Week{\n" +
                "Сегодня " + title + '\n' +
                '}';
    }
}

public class Week {


    public static void main(String args[]){
        int s;
        Day_of_Week d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        s = sc.nextInt();
        switch (s){
            case 1:{
                d = Day_of_Week.MONDAY;
                System.out.println(d);
                break;
            }
            case 2:{
                d = Day_of_Week.TUESDAY;
                System.out.println(d);
                break;

            }
            case 3:{
                d = Day_of_Week.WEDNESDAY;
                System.out.println(d);
                break;

            }
            case 4:{
                d = Day_of_Week.THURSDAY;
                System.out.println(d);
                break;

            }
            case 5:{
                d = Day_of_Week.FRIDAY;
                System.out.println(d);
                break;

            }
            case 6:{
                d = Day_of_Week.SATURDAY;
                System.out.println(d);
                break;

            }
            case 7:{
                d = Day_of_Week.SUNDAY;
                System.out.println(d);
                break;

            }
        }
    }
}
