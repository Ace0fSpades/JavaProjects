package task22;

import java.util.Scanner;

enum CarType{
    BMW,
    Audi,
    Mercedes,
    Ford
}

class Car{
    public String name;
    public int price;
    Car(String s, int p){
        name = s;
        price = p;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Bmw extends Car{
    Bmw(){
        super("BMW", 8000);

    }
}
class Audi extends Car{
    Audi(){
        super("Audi", 7000);
    }
}
class Mercedes extends Car{
    Mercedes(){
        super("Mercedes", 8500);
    }
}
class Ford extends Car{
    Ford(){
        super("Ford", 6875);
    }
}

class CarFactory{
    public Car makeCar(CarType type){
        Car car = null;
        switch (type){
            case BMW:{
                car = new Bmw();
                break;
            }
            case Audi:{
                car = new Audi();
                break;
            }
            case Ford:{
                car = new Ford();
                break;
            }
            case Mercedes:{
                car = new Mercedes();
                break;
            }
        }
        return car;
    }
}

public class Run {
    public static void main(String args[]){
        CarFactory factory = new CarFactory();
        System.out.print("Доступно 4 марки авто: BMW, Audi, Mercedes, Ford.\nВведите название: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Car ans = new Car("Null",0);
        switch (s){
            case "BMW":{
                ans = factory.makeCar(CarType.BMW);
                break;
            }
            case "Audi":{
                ans = factory.makeCar(CarType.Audi);
                break;
            }
            case "Ford":{
                ans = factory.makeCar(CarType.Ford);
                break;
            }
            case "Mercedes":{
                ans = factory.makeCar(CarType.Mercedes);
                break;
            }
        }
        System.out.println(ans);
    }
}
