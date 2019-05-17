package com.nicefish.oo;

public class Animal{
    private String name;
    private int age;
    public static int counter=0;

    public Animal(){
        counter++;
    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
        counter++;
    }

    //I/O
    public void eat(){
        System.out.println("动物吃东西...");
    }

    public void run(){
        System.out.print("动物在运动...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
