package task5;

public abstract class Dog {
    private int age;
    private String name;

    Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
    public final int getAge(){
        return age;
    }
    public final String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "Name: "+name+"\nAge: "+age;
    }


}

class German extends Dog {
    private String species;

    German(String name, int age){
        super(name,age);
        this.species = "German";
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setAge(int age){
        super.setAge(age);
    }
    public String toString(){
        return super.toString()+"\nSpecies: "+species;
    }

}
class England extends Dog {
    private String species;

    England(String name, int age){
        super(name,age);
        this.species = "England";
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setAge(int age){
        super.setAge(age);
    }
    public String toString(){
        return super.toString()+"\nSpecies: "+species;
    }

}
