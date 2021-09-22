package task3;

public class Book {
    private String name;
    private String person;
    private int year;
    private int price;

    public Book(String n, String per, int pr, int y){
        name = n;
        person = per;
        price = pr;
        year = y;
    }
    public Book(String n, String per){
        name = n;
        person = per;
        price = 150;
        year = 0;
    }
    public Book(){
        name = "undefined";
        person = "unknown";
        price = 100;
        year = 0;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(int p){
        price = p;
    }
    public void setYear(int y){
        year = y;
    }
    public void setPerson(String per){
        person = per;
    }
    public String getName(){
        return name;
    }
    public String getPerson(){
        return person;
    }
    public int getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Name: "+name+"\nAuthor: "+person+"\nYear: "+year+"\nCosts: "+price+" rub";
    }
}
