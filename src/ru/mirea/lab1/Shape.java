package ru.mirea.lab1;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "White";
        filled = false;
    }
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean f){
        filled = f;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape{
    protected double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double r){
        radius = r;
    }
    public Circle(double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "Circle: \n"+
                "Radius: "+radius+'\n'+
                "Color: "+color+'\n'+
                "Filled: "+filled;
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 1.0;
        length = 2.0;
    }
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getLength(){
        return  length;
    }
    public void setLength(double l){
        length = l;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Rectangle: \n"+
                "Width: "+width+" Length: "+length+'\n'+
                "Color: "+color+" Filled: "+filled;
    }

}
class Square extends Rectangle{
    public Square(){
        width = length = 1.0;
    }
    public Square(double side){
        width = length = side;
    }
    public Square(double side, String c, boolean f){
        width = length = side;
        color = c;
        filled = f;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        length = width = side;
    }
    public void setWidth(double side){
        width = side;
    }
    public void setLength(double side){
        length = side;
    }
    public String toString(){
        return "Square: \n"+
                "Side: "+width+"\nColor: "+color+"\nFilled: "+filled;
    }
}