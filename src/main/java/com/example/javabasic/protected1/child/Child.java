package com.example.javabasic.protected1.child;

import com.example.javabasic.protected1.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 2;
        //defaultValue //only same package
        //privateValue

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }

}
