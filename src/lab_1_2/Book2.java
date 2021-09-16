package lab_1_2;

public class Book2 {
    private String name;
    private String person;
    private short year;
    private int price;

    public Book2(String n, String per, int pr, short y){
        name = n;
        person = per;
        price = pr;
        year = y;
    }
    public Book2(String n, String per){
        name = n;
        person = per;
        price = 150;
        year = 0;
    }
    public Book2(){
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
    public void setYear(short y){
        year = y;
    }
    public void setPerson(String per){
        person = per;
    }
    public String toString(){
        return name+"\nAuthor: "+person+"\nYear: "+year+"\nCosts: "+price+" rub";
    }
}
