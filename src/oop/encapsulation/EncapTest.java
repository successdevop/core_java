package oop.encapsulation;

public class EncapTest{
    private String name;
    private String idNum;
    private int age;

    public String getName(){
        return this.name;
    }

    public String getIdNum(){
        return this.idNum;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNum(String idNum){
        this.idNum = idNum;
    }

    public void setAge(int age){
        this.age = age;
    }
}