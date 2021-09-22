package task3;

import java.util.Scanner;

public class Human {
    private int weight;
    private int height;
    private char gender;
    Head Golova;
    Leg Right_leg, Left_leg;
    Hand Right_hand, Left_hand;

    public Human(){
        weight = 55;
        height = 175;
        gender = 'M';
        Golova = new Head();
        Right_leg = new Leg();
        Left_leg = new Leg();
        Right_hand = new Hand();
        Left_hand = new Hand();
    }
    public Human(int weight,int height, char gender){
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        Scanner sc = new Scanner(System.in);
        String hc = sc.nextLine(), ec = sc.nextLine();
        this.Golova = new Head(hc,ec);
        String pos = sc.nextLine();
        int length = sc.nextInt();
        this.Right_hand = new Hand(length,pos);
        this.Left_hand = Right_hand;
        length = sc.nextInt();
        this.Right_leg = new Leg(length);
        this.Left_leg = Right_leg;
    }
    public void getHuman(){
        System.out.println("Weight: "+weight+"| Heigth: "+height);
        System.out.println("Head: ");
        Golova.get();
        System.out.println("Hands: R = "+Right_hand+" || L = "+Left_hand);

        System.out.println("Legs: R = Length "+Right_leg.getLength()+" || L = Length "+Left_leg.getLength());


    }
}
