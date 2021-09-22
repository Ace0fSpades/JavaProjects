package task6;

public interface Priceable {
    void getPrice();
}

class Phone implements Priceable{
    private int price;
    private String name;

    Phone(){
        name = "Unknown";
        price = 100;
    }
    Phone(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Phone price: "+price);
    }
}

class Pad_2 implements Priceable{
    private int price;
    private String name;

    Pad_2(){
        name = "Unknown";
        price = 100;
    }
    Pad_2(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Pad price: "+price);
    }
}

class Furniture implements Priceable{
    private int price;
    private String name;

    Furniture(){
        name = "Unknown";
        price = 100;
    }
    Furniture(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getPrice(){
        System.out.println(name+" price: "+price);
    }
}