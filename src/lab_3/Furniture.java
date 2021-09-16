package lab_3;

public abstract class Furniture {
    private String type;
    private String material;
    private int price;

    Furniture(String type,  String material, int price){
        this.material = material;
        this.type = type;
        this.price = price;
    }
    public final String getType(){
        return type;
    }
    public final String getMaterial(){
        return material;
    }
    public final int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public final String toString(){
        return "Type: "+type+"\nMaterial: "+material+"\nPrice: "+price;
    }

}

class Sofa extends Furniture{
    Sofa(String material,int price){
        super("Sofa",material,price);
    }

}
class Table extends Furniture{
    Table(String material,int price){
        super("Table",material,price);
    }
}
class Chair extends Furniture{
    Chair(String material,int price){
        super("Chair",material,price);
    }
}
