package task2;

import java.lang.*;

public class Test {
    public static void main(String[] args){
        Movable p = new MovableCircle(10,10,5,5,30);
        System.out.println(p);
        p.moveDown();
        p.moveDown();
        p.moveDown();
        System.out.println(p);
        Ball a = new Ball();
        System.out.println(a);
        Book b = new Book();
        System.out.println(b);
        Dog c = new Dog();
        System.out.println(c);
    }
}
