package task4;

public class Test {
    public static void main(String[] args){
        Author a = new Author();
        a.setEmail("Test@mail.ru");
        Ball b = new Ball();
        b.setX(10);
        b.setY(20);
        b.move(15,30);
        System.out.println(a);
        System.out.println(b);
    }
}
