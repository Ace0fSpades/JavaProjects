package prac1;

public class Ball {
    private int rad;
    private String color;

    public Ball(String c, int n){
        color = c;
        rad = n;
    }
    public Ball(int n){
        color = "White";
        rad = n;
    }
    public Ball(){
        color = "Red";
        rad = 5;
    }
    public void setRad(int n){
        rad = n;
    }
    public double getSquare(){
        return 3.14*rad*rad;
    }
    public void outStat(){
        System.out.println("Color is "+color+" and rad is "+rad);
    }
    public String toString(){
        return color+" rad is "+rad;
    }
}
