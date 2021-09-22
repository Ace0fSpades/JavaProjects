package task6;

public interface Nameable {
    void getName();
}

class Planet implements Nameable{
    private String name;
    private int mass;

    Planet(){
        name = "Unknown";
        mass = 1;
    }
    Planet(String name, int mass){
        this.name = name;
        this.mass = mass;
    }
    public void getName(){
        System.out.println("Planet name: "+name);
    }
}

class Pad implements Nameable{
    private String name;
    private int price;

    Pad(){
        name = "None";
        price = 1;
    }
    Pad(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getName(){
        System.out.println("Pad name: "+name);
    }
}

class Plane implements Nameable{
    private String name;
    private String company;

    Plane(){
        name = "UNW-000";
        company = "None";
    }
    Plane(String name,String company){
        this.name = name;
        this.company = company;
    }
    public void getName(){
        System.out.println("Plane name: "+name);
    }
}