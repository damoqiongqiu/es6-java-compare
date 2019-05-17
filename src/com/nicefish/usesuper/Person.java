package com.nicefish.usesuper;

public class Person extends Animal{
    public Person(){

    }

    public Person(String name){
        super();
        this.name=name;
    }

    public void eat(){
        super.eat();
        System.out.println("人类吃熟的东西...");
    }

    public void sayHello(){
        System.out.println("Hello, my name is> "+this.name);
    }

    public static void main(String[] args){
        Person person=new Person("码农");
        person.eat();
        person.sayHello();
    }
}
