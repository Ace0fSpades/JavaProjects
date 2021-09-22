package task5;

public abstract class Dish {
    private String material;
    private String type;

    Dish(String material, String type){
        this.type = type;
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
    public String getType(){
        return type;
    }
    public void setMaterial(String material){
        this.material = material;
    };
    public void setType(String type){
        this.type = type;
    };

    public String toString(){
        return "Type: "+type+"\nMaterial: "+material;
    }
}

class Pot extends Dish{

    private String size;

    Pot(String material,String type,String size){
        super(material,type);
        this.size = size;
    }
    public void setMaterial(String material){
        super.setMaterial(material);
    }
    public void setType(String type){
        super.setType(type);
    }
    public void setSize(String size){
        this.size = size;
    }
    public String toString(){
        return super.toString()+"\nSize: "+size;
    }

}

class Pan extends Dish{

    private String firm;

    Pan(String material,String type,String firm){
        super(material,type);
        this.firm = firm;
    }
    public void setMaterial(String material){
        super.setMaterial(material);
    }
    public void setType(String type){
        super.setType(type);
    }
    public void setFirm(String firm){
        this.firm = firm;
    }
    public String toString(){
        return super.toString()+"\nFirm: "+firm;
    }

}
