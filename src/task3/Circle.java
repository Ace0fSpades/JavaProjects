package task3;

public class Circle {
    private int rad;
    public Circle(){
        rad = 5;
    }
    public Circle(int rad){
        this.rad = rad;
    }
    public void setRad(int rad){
        this.rad = rad;
    }
    public int getRad(){
        return rad;
    }
    public double Area(){
        return 3.14*rad*rad;
    }
    public double Perimeter(){
        return 2*3.14*rad;
    }
    public String toString(){
        return "Circle\n"+"Rad: "+rad+"\nArea: "+Area()+"\nPerimeter: "+Perimeter();
    }

}

