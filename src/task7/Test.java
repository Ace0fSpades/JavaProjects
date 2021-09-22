package task7;

public class Test {
    public static void main(String[] args){
        Movable p = new MovableCircle(10,10,5,5,30);
        System.out.println(p);
        p.moveDown();
        p.moveDown();
        p.moveDown();
        System.out.println(p);
        Movable c = new MovableRectangle(3,4,8,1,3,3);
        System.out.println(c);
    }
}
