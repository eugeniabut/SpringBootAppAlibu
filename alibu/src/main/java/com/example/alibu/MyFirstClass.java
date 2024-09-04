package com.example.alibu;

import org.springframework.stereotype.Component;


public class MyFirstClass {


    private String myVar;

    //Constructor
    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return myVar;

    }
}
