package task7;

public interface Movable {
     void moveUp();
     void moveDown();
     void moveLeft();
     void moveRight();

}

class MovablePoint implements Movable{
    private int x,y;
    private int xSpeed,ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public String toString(){
        return "Point:\n"+"Pos: "+x+" "+y+"\nSpeed: "+xSpeed+" "+ySpeed;
    }
    public void moveUp(){
        y+=ySpeed;
    }
    public void moveDown(){
        y-=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
}

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return "Circle:\n"+"Rad: "+radius+"\n"+center.toString();
    }
    public void moveUp(){
        center.moveUp();

    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}