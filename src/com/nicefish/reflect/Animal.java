package com.nicefish.reflect;

public class Animal {
    private String name;

    Animal(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println("Animal eat...");
    }

    public void run(){
        System.out.println("Animal run...");
    }

    public static void main(String[] args) {
        Animal animal=new Animal("damoqiongqiu");
        animal.eat();
        animal.run();
    }
}
