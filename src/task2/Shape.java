package task2;

public class Shape {
    private String figure;
    private int param;
    public Shape(String f, int p){
        figure = f;
        param = p;
    }
    public Shape(String f){
        figure = f;
        param = 100;
    }
    public Shape(){
        figure = "Square";
        param = 5;
    }
    public void setFigure(int param){
        this.param = param;
    }
    public void setFigure(String figure){
        this.figure = figure;
    }
    public String getFigure(){
        return figure;
    }
    public String toString(){
        return this.figure+", param "+this.param;
    }

}
