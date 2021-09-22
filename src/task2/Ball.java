package task2;

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
    public void setColor(String c){
        color = c;
    }
    public int getRad(){
        return rad;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "Color is "+color+" and rad is "+rad;
    }
}
