package lab_1_2;

public class Hand {
    private int length;
    private String pos;
    public Hand(){
        length = 70;
        pos = "Down";
    }
    public Hand(int length, String pos){
        this.length = length;
        this.pos = pos;
    }
    public void setPos(String pos){
        this.pos = pos;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getPos(){
        return pos;
    }
    public int getLength(){
        return length;
    }
    public void get(){
        System.out.print("Pos: "+pos+"| Length: "+length+"\n");
    }
}
