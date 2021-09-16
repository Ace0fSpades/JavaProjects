package prac1;

public class Book {
    private String name;
    private int price;

    public Book(String n, int p){
        name = n;
        price = p;
    }
    public Book(String n){
        name = n;
        price = 150;
    }
    public Book(){
        name = "undefined";
        price = 100;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(int p){
        price = p;
    }
    public String toString(){
        return name+" costs "+price+" rub";
    }
}
