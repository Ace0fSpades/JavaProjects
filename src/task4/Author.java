package task4;

import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String m, char g){
        name = n;
        email = m;
        gender = g;
    }
    public Author(){
        name = "Karl";
        email = "none@none.com";
        gender = 'M';
    }
    public String getName(){
       return "Name: "+name+'\n';
    }
    public String getEmail(){
        return "E-mail: "+email+'\n';
    }
    public void setEmail(String m){
        email = m;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "Name: "+name+'\n'+"Email: "+email+'\n'+"Gender: "+gender;
    }
}
