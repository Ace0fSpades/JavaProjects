package task5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
       // Pan a = new Pan("marble","Pan","Tefal");
      //  System.out.println(a);
       // Pot b = new Pot("stick","Pot","small");
      //  System.out.println(b);
       // German c = new German("Bob",15);
       // System.out.println(c);
       // England e = new England("Karl",4);
       // System.out.println(e);
        //Sofa f = new Sofa("wood",5000);
       // System.out.println(f);
        FurnitureShop a = new FurnitureShop();
        String type;
        Scanner sc = new Scanner(System.in);
        type = sc.nextLine();
        a.sell_item(type);
        a.get_list();
    }
}
