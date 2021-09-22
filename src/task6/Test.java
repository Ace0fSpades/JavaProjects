package task6;

public class Test {
    public static void main(String[] args){
        Nameable a = new Planet("Mars",15000);
        a.getName();
        a = new Pad("Ipad",4500);
        a.getName();
        a = new Plane("UFX-413","Airflot");
        a.getName();
        Priceable b = new Phone("Samsung",300);
        b.getPrice();
        b = new Pad_2("Apple",1245);
        b.getPrice();
        b = new Furniture("Sofa", 23500);
        b.getPrice();
    }
}
