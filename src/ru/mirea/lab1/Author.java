package ru.mirea.lab1;

import java.lang.*;
import java.util.Scanner;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String m, char g){
        name = n;
        email = m;
        gender = g;
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
