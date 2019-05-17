package com.nicefish.rest;

public class Rest {
    public int sum(int ...args){
        int result=0;
        for(int i:args) {
            result += i;
        }
        return result;
    }

    public static  void main(String[] args){
        int result=new Rest().sum(1,2,3);
        System.out.println(result);
    }
}
