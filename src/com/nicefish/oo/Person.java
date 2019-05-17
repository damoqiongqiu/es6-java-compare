package com.nicefish.oo;

public class Person extends Monkey{
    public void eat(){
        System.out.print("人类吃熟食...");
    }

    public static void  main(String[] args){
        Person person=new Person();
        person.eat();

//        Animal animal=new Person();
//        animal.eat();
//
//        Animal animal1=new Monkey();
//        animal1.eat();
    }
}
