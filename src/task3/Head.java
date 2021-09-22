package task3;

public class Head {
    private String hair_color;
    private String eyes_color;
    public Head(){
        hair_color = "Black";
        eyes_color = "Brown";
    }
    public Head(String hc,String ec){
        hair_color = hc;
        eyes_color = ec;
    }
    public void setHair_color(String hair_color){
        this.hair_color = hair_color;
    }
    public void setEyes_color(String eyes_color){
        this.eyes_color = eyes_color;
    }
    public String getHair_color(){
        return hair_color;
    }
    public String getEyes_color(){
        return eyes_color;
    }
    public void get(){
        System.out.print("Hair color: "+hair_color+"| Eyes color: "+eyes_color+"\n");
    }
}
