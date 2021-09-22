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

class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomright;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topleft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomright = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public void moveUp(){
        topleft.moveUp();
        bottomright.moveUp();
    }
    public void moveDown(){
        topleft.moveDown();
        bottomright.moveDown();
    }
    public void moveLeft(){
        topleft.moveLeft();
        bottomright.moveLeft();
    }
    public void moveRight(){
        topleft.moveRight();
        bottomright.moveRight();
    }
    public String toString(){
        return "Rectangle:\nTop-Left "+topleft+"\nBottom-Right "+bottomright;
    }
}