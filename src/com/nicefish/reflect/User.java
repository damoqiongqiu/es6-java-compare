package com.nicefish.reflect;

public class User {
    private String userName;

    //必须提供无参构造，这是因为Java的反射机制在创建实例的时候只能无参创建（这是当年设计上的一个缺陷）
    public User(){

    }

    public User(String userName){
        this.userName=userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void sayHello(){
        System.out.println("调用sayHello()...");
    }
}
